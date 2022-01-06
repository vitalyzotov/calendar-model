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

    public static DateRange<LocalDate> of(YearMonth yearMonth) {
        return new DateRange<>(yearMonth.atDay(1), yearMonth.atEndOfMonth());
    }

    public static <T extends Temporal> DateRange<T> of(T start, T finish) {
        return new DateRange<>(start, finish);
    }

    public T start() {
        return start;
    }

    public T finish() {
        return finish;
    }

    public long width(ChronoUnit unit) {
        return unit.between(start, finish);
    }

    public DateRange<T> startingAt(T start) {
        return new DateRange<>(start, this.finish);
    }

    public DateRange<T> finishingAt(T finish) {
        return new DateRange<>(this.start, finish);
    }

    public boolean includes(LocalDate date) {
        return ChronoUnit.DAYS.between(start, date) >= 0 && ChronoUnit.DAYS.between(date, finish) >= 0;
    }

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
}
