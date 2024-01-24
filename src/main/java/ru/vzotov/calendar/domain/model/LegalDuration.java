package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang3.Validate;
import ru.vzotov.ddd.shared.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class LegalDuration implements ValueObject<LegalDuration> {

    private final Unit unit;
    private final int value;

    public LegalDuration(Unit unit, int value) {
        Validate.notNull(unit);
        this.unit = unit;
        this.value = value;
    }

    public Unit unit() {
        return unit;
    }

    public int value() {
        return value;
    }

    public ContextualDuration with(WorkCalendar context) {
        return new ContextualDuration(context, this);
    }

    public static LegalDuration ofWorkingDays(int value) {
        return new LegalDuration(Unit.WORKING_DAYS, value);
    }

    public static LegalDuration ofCalendarDays(int value) {
        return new LegalDuration(Unit.CALENDAR_DAYS, value);
    }

    @Override
    public boolean sameValueAs(LegalDuration that) {
        return value == that.value && unit == that.unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LegalDuration that)) return false;
        return sameValueAs(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    @Override
    public String toString() {
        return value + unit.shortName();
    }

    public static LegalDuration parse(CharSequence text) {
        StringBuilder vb = new StringBuilder();
        StringBuilder ub = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            final char ch = text.charAt(i);
            if (Character.isDigit(ch)) vb.append(ch);
            else if (Character.isLetter(ch)) ub.append(ch);
        }
        String sUnit = ub.toString().toLowerCase();
        int v = Integer.parseInt(vb.toString());
        if (Unit.WORKING_DAYS.shortName().equals(sUnit)) {
            return ofWorkingDays(v);
        } else if (Unit.CALENDAR_DAYS.shortName().equals(sUnit)) {
            return ofCalendarDays(v);
        } else throw new IllegalArgumentException("Unknown unit '%s'".formatted(sUnit));
    }

    public enum Unit {
        WORKING_DAYS("wd"), CALENDAR_DAYS("cd");
        private final String shortName;

        public String shortName() {
            return shortName;
        }

        Unit(String shortName) {
            this.shortName = shortName;
        }
    }

    public record ContextualDuration(WorkCalendar context, LegalDuration duration) {
        public ContextualDuration {
            Validate.notNull(context);
            Validate.notNull(duration);
        }

        public LocalDate add(LocalDate date) {
            final LocalDate result = date.plusDays(duration().value());
            return switch (duration().unit()) {
                case WORKING_DAYS -> context.plusWorkdays(date, duration().value());
                case CALENDAR_DAYS -> date.plusDays(duration().value());
            };
        }
    }
}
