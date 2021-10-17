package ru.vzotov.calendar.domain.model;

import org.apache.commons.lang.Validate;
import ru.vzotov.ddd.shared.Entity;

import java.time.LocalDate;
import java.util.Objects;

public class SpecialDay implements Entity<SpecialDay> {

    private LocalDate day;

    private String location;

    private String name;

    private DayType type;

    public SpecialDay(LocalDate day, String location, String name, DayType type) {
        Validate.notNull(day);
        Validate.notNull(location);
        Validate.notNull(name);
        Validate.notNull(type);
        this.day = day;
        this.location = location;
        this.name = name;
        this.type = type;
    }

    public LocalDate day() {
        return day;
    }

    public String location() {
        return location;
    }

    public String name() {
        return name;
    }

    public DayType type() {
        return type;
    }

    @Override
    public boolean sameIdentityAs(SpecialDay other) {
        return other != null && Objects.equals(day, other.day) && Objects.equals(location, other.location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialDay that = (SpecialDay) o;
        return sameIdentityAs(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, location);
    }

    protected SpecialDay() {
        // for Hibernate
    }

    private Long id; // surrogate key
}
