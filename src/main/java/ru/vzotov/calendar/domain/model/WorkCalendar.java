package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang3.Validate;
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

    private final LocalDate from;

    private final LocalDate to;

    private final String location;

    private final Set<SpecialDay> specialDays;

    private final Map<LocalDate, SpecialDay> specialDaysMap;

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
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> DayType.WEEKEND;
            default -> DayType.WORKING;
        };
    }

    public int workdaysBetween(LocalDate start, LocalDate finish) {
        int result = 0;
        for (LocalDate date = start; !date.isAfter(finish); date = date.plusDays(1)) {
            if (typeOfDay(date) == DayType.WORKING) {
                result++;
            }
        }
        return result;
    }

    /**
     * Calculates date after N business days of another date
     *
     * @param base     the base date
     * @param workdays number of workdays to add
     * @return date after
     */
    public LocalDate plusWorkdays(LocalDate base, int workdays) {
        LocalDate date = base;
        for (int i = workdays; i > 0; i--) {
            while ((typeOfDay(date) != DayType.WORKING)) {
                date = date.plusDays(1);
            }
        }
        return date;
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
