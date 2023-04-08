package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang.Validate;
import ru.vzotov.ddd.shared.ValueObject;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Objects;

public class DateRange<T extends Temporal> implements ValueObject<DateRange<T>> {
    private final T start;
    private final T finish;

    /**
     * Creates a new date range between start (inclusive) and finish (inclusive)
     *
     * @param start  start of the date range (inclusive)
     * @param finish finish of the date range (inclusive)
     */
    public DateRange(T start, T finish) {
        Validate.notNull(start);
        Validate.notNull(finish);
        Validate.isTrue(
                (start.isSupported(ChronoUnit.SECONDS) && ChronoUnit.SECONDS.between(start, finish) >= 0) ||
                        (start.isSupported(ChronoUnit.DAYS) && ChronoUnit.DAYS.between(start, finish) >= 0)
        );

        this.start = start;
        this.finish = finish;
    }

    /**
     * Creates a new date range from a month
     *
     * @param yearMonth the month
     * @return a new date range between the first day of month and the last day of month
     */
    public static DateRange<LocalDate> of(YearMonth yearMonth) {
        return new DateRange<>(yearMonth.atDay(1), yearMonth.atEndOfMonth());
    }

    /**
     * Creates a new date range between start (inclusive) and finish (inclusive)
     *
     * @param start  start of the date range (inclusive)
     * @param finish finish of the date range (inclusive)
     */
    public static <T extends Temporal> DateRange<T> of(T start, T finish) {
        return new DateRange<>(start, finish);
    }

    /**
     * Gets the start of the date range
     *
     * @return the value of start of the date range
     */
    public T start() {
        return start;
    }

    /**
     * Gets the finish of the date range
     *
     * @return the value of finish of the date range
     */
    public T finish() {
        return finish;
    }

    /**
     * Calculates the amount of time between start and finish of the date range
     *
     * @param unit the unit
     * @return the amount of time between start and finish
     */
    public long width(ChronoUnit unit) {
        return unit.between(start, finish);
    }

    /**
     * Creates a new date range that starts at specified time and finishes at the same time as this date range
     *
     * @param start the new start time
     * @return new date range
     */
    public DateRange<T> startingAt(T start) {
        return new DateRange<>(start, this.finish);
    }

    /**
     * Creates a new date range that starts at the same time as this date range and finishes at specified time
     *
     * @param finish the new finish time
     * @return the new date range
     */
    public DateRange<T> finishingAt(T finish) {
        return new DateRange<>(this.start, finish);
    }

    /**
     * Checks that the date range contains the specified date
     *
     * @param date the date to check
     * @return true if the date range includes the specified date; false otherwise
     */
    public boolean includes(LocalDate date) {
        return includes(date, ChronoUnit.DAYS);
    }

    public boolean includes(Temporal temporal, ChronoUnit unit) {
        return unit.between(start, temporal) >= 0 && unit.between(temporal, finish) >= 0;
    }

    /**
     * Checks that the date range is completely included into another date range.
     *
     * @param other another date range to check
     * @param unit  the unit that will be used to compare two date ranges
     * @return this date range if the date range is completely included into other date range;
     * otherwise returns the intersection of the two date ranges
     */
    public DateRange<T> within(DateRange<T> other, ChronoUnit unit) {
        Validate.notNull(other);
        boolean invalid = false;
        T s = this.start; // new start
        T f = this.finish; // new finish
        if (unit.between(other.start, this.start) < 0) {
            invalid = true;
            s = other.start;
        }
        if (unit.between(this.finish, other.finish) < 0) {
            invalid = true;
            f = other.finish;
        }
        return invalid ? new DateRange<>(s, f) : this;
    }

    /**
     * Overlaps the date range with other date range
     * @param other the other date range
     * @param unit the unit
     * @return intersection of two ranges; null if ranges do not overlap.
     */
    public DateRange<T> intersect(DateRange<T> other, ChronoUnit unit) {
        Validate.notNull(other);
        T s1 = this.start;
        T f1 = this.finish;
        T s2 = other.start;
        T f2 = other.finish;
        boolean intersects = this.includes(s2, unit) || this.includes(f2, unit)
                || other.includes(s1, unit) || other.includes(f1, unit);

        return intersects ? new DateRange<>(max(s1, s2, unit), min(f1, f2, unit)) : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateRange<?> dateRange = (DateRange<?>) o;
        return sameValueAs(dateRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }

    @Override
    public String toString() {
        return "[" + start + ", " + finish + ']';
    }

    @Override
    public boolean sameValueAs(DateRange that) {
        return that != null && Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish);
    }

    private static <T extends Temporal> T max(T t1, T t2, ChronoUnit unit) {
        return unit.between(t1, t2) > 0 ? t2 : t1;
    }

    private static <T extends Temporal> T min(T t1, T t2, ChronoUnit unit) {
        return unit.between(t1, t2) < 0 ? t2 : t1;
    }
}
