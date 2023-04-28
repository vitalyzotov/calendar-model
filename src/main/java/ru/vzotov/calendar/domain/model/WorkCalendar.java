package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang.Validate;
import ru.vzotov.ddd.shared.AggregateRoot;
import ru.vzotov.ddd.shared.Entity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@AggregateRoot
public class WorkCalendar implements Entity<WorkCalendar> {

    private LocalDate from;

    private LocalDate to;

    private String location;

    private Set<SpecialDay> specialDays;

    private Map<LocalDate, SpecialDay> specialDaysMap;

    public WorkCalendar(LocalDate from, LocalDate to, String location, Collection<SpecialDay> specialDays) {
        Validate.notNull(from);
        Validate.notNull(to);
        Validate.notNull(location);
        Validate.notNull(specialDays);
        Validate.isTrue(specialDays.stream().noneMatch(date -> date.day().isAfter(to) || date.day().isBefore(from)));
        this.from = from;
        this.to = to;
        this.location = location;
        this.specialDays = new HashSet<>(specialDays);
        this.specialDaysMap = specialDays.stream().collect(Collectors.toMap(
                SpecialDay::day,
                Function.identity()
        ));
    }

    public LocalDate from() {
        return from;
    }

    public LocalDate to() {
        return to;
    }

    public String location() {
        return location;
    }

    public Set<SpecialDay> specialDays() {
        return specialDays;
    }

    public DayType typeOfDay(LocalDate date) {
        Validate.isTrue(!(date.isBefore(from) || date.isAfter(to)));
        SpecialDay special = specialDaysMap.get(date);
        if (special != null) return special.type();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY:
                return DayType.WEEKEND;

            default:
                return DayType.WORKING;
        }
    }

    public int workdaysBetween(LocalDate start, LocalDate finish) {
        int result = 0;
        for (LocalDate date = start; !date.isAfter(finish); date = date.plusDays(1)) {
            switch (typeOfDay(date)) {
                case WORKING:
                    result++;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public WorkCalendar merge(WorkCalendar other) {
        Validate.isTrue(location().equals(other.location()));
        Set<SpecialDay> days = new HashSet<>(specialDays());
        days.addAll(other.specialDays());
        return new WorkCalendar(
                LocalDate.ofEpochDay(Math.min(from().toEpochDay(), other.from().toEpochDay())),
                LocalDate.ofEpochDay(Math.max(to().toEpochDay(), other.to().toEpochDay())),
                location(),
                days
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkCalendar that = (WorkCalendar) o;
        return sameIdentityAs(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public boolean sameIdentityAs(WorkCalendar that) {
        return that != null && Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) && Objects.equals(location, that.location);
    }
}
