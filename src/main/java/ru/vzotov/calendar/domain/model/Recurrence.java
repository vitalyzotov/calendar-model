package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang3.Validate;
import ru.vzotov.ddd.shared.ValueObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Recurrence implements ValueObject<Recurrence> {

    /**
     * Периодичность повторения
     */
    private final RecurrenceUnit unit;

    /**
     * Начало повторения
     */
    private LocalDate start;

    /**
     * Конец повторения
     */
    private LocalDate finish;

    /**
     * Правило отбора периода.
     * Каждый, каждый второй, каждый третий и т.д.
     */
    private int nth = 1;

    /**
     * Порядковый номер дня в периоде.
     */
    private int day = 1;

    /**
     * Считать рабочие дни, или календарные
     */
    private boolean workingDays = false;

    private LocalDate date;

    public Recurrence(LocalDate date) {
        Validate.notNull(date);

        this.unit = RecurrenceUnit.DATE;
        this.date = date;
    }

    /**
     * Повтор начиная с даты <code>start</code>, используя периодичность <code>unit</code>
     *
     * @param start
     * @param unit
     */
    public Recurrence(LocalDate start, LocalDate finish, RecurrenceUnit unit) {
        Validate.notNull(start);
        Validate.notNull(unit);
        Validate.isTrue(RecurrenceUnit.MONTHLY.equals(unit) || RecurrenceUnit.WEEKLY.equals(unit));

        this.start = start;
        this.finish = finish;
        this.unit = unit;
    }

    /**
     * Повтор начиная с даты <code>start</code>, используя периодичность <code>unit</code>
     *
     * @param start
     * @param unit
     * @param nth
     */
    public Recurrence(LocalDate start, LocalDate finish, RecurrenceUnit unit, int nth) {
        this(start, finish, unit, nth, 1, false);
    }

    public Recurrence(LocalDate start, LocalDate finish, RecurrenceUnit unit, int nth, int day) {
        this(start, finish, unit, nth, day, false);
    }

    public Recurrence(LocalDate start, LocalDate finish, RecurrenceUnit unit, int nth, int day, boolean workingDays) {
        Validate.notNull(start);
        Validate.notNull(unit);
        Validate.isTrue(RecurrenceUnit.MONTHLY.equals(unit) || RecurrenceUnit.WEEKLY.equals(unit));

        this.start = start;
        this.finish = finish;
        this.unit = unit;
        this.nth = nth;
        this.day = day;
        this.workingDays = workingDays;
    }

    public RecurrenceUnit unit() {
        return unit;
    }

    public LocalDate start() {
        return start;
    }

    public LocalDate finish() {
        return finish;
    }

    public LocalDate date() {
        return date;
    }

    public int nth() {
        return nth;
    }

    public int day() {
        return day;
    }

    public boolean isWorkingDays() {
        return workingDays;
    }

    public boolean matches(LocalDate date) {
        return matches(date, null);
    }

    public boolean matches(LocalDate date, WorkCalendar calendar) {
        Validate.isTrue(!(isWorkingDays() && calendar == null));
        if (start != null && date.isBefore(start)) return false;
        if (finish != null && date.isAfter(finish)) return false;

        int d;

        switch (unit()) {
            case MONTHLY:
                long months = ChronoUnit.MONTHS.between(start, date);
                if ((months % nth) != 0) return false;
                d = date.getDayOfMonth();
                return d == day();

            case WEEKLY:
                long weeks = ChronoUnit.WEEKS.between(start, date);
                if ((weeks % nth) != 0) return false;
                d = date.getDayOfWeek().getValue();
                return d == day();

            case DATE:
                return date.isEqual(this.date);

            default:
                throw new IllegalStateException("Unknown unit " + unit());
        }
    }

    @Override
    public boolean sameValueAs(Recurrence that) {
        return that != null && nth == that.nth &&
                day == that.day &&
                workingDays == that.workingDays &&
                unit == that.unit &&
                Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish) &&
                Objects.equals(date, that.date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recurrence that = (Recurrence) o;
        return sameValueAs(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, start, finish, nth, day, workingDays, date);
    }

    @Override
    public String toString() {
        return unit.symbol() +
                (start == null ? "" : start.format(DateTimeFormatter.ISO_LOCAL_DATE)) +
                "(" + nth + ")" +
                (date == null ? "" : date.format(DateTimeFormatter.ISO_LOCAL_DATE)) +
                "[" + day + (workingDays ? 'w' : "") + "]" +
                (finish == null ? "" : finish.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public static Recurrence fromString(String value) {
        Validate.notEmpty(value);

        int parenthesisOpen = -1;
        int parenthesisClose = -1;
        int bracketOpen = -1;
        int bracketClose = -1;
        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {
                case '(' -> parenthesisOpen = i;
                case ')' -> parenthesisClose = i;
                case '[' -> bracketOpen = i;
                case ']' -> bracketClose = i;
            }
        }
        Validate.isTrue(parenthesisOpen > 0);
        Validate.isTrue(parenthesisClose > parenthesisOpen);
        Validate.isTrue(bracketOpen > parenthesisClose);
        Validate.isTrue(bracketClose > bracketOpen);

        final RecurrenceUnit unit = RecurrenceUnit.of(value.charAt(0));

        final LocalDate start = parenthesisOpen == 1 ? null : LocalDate.parse(value.substring(1, parenthesisOpen));
        final LocalDate finish = bracketClose >= value.length() - 1 ? null : LocalDate.parse(value.substring(bracketClose + 1));
        final int nth = Integer.parseInt(value.substring(parenthesisOpen + 1, parenthesisClose));
        final LocalDate date = (bracketOpen - parenthesisClose) <= 1 ? null : LocalDate.parse(value.substring(parenthesisClose + 1, bracketOpen));
        final boolean workdays = value.charAt(bracketClose - 1) == 'w';
        final int day = Integer.parseInt(value.substring(bracketOpen + 1, bracketClose - (workdays ? 1 : 0)));

        if (unit == RecurrenceUnit.DATE) {
            Validate.notNull(date);
            return new Recurrence(date);
        } else {
            Validate.isTrue(date == null);
            return new Recurrence(start, finish, unit, nth, day, workdays);
        }
    }

}
