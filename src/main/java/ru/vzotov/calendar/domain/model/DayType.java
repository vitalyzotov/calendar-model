package ru.vzotov.calendar.domain.model;

import ru.vzotov.ddd.shared.ValueObject;

public enum DayType implements ValueObject<DayType> {
    WORKING('W'), HOLIDAY('H'), WEEKEND('N');

    private final char symbol;

    DayType(char symbol) {
        this.symbol = symbol;
    }

    public char symbol() {
        return symbol;
    }

    @Override
    public boolean sameValueAs(DayType other) {
        return this.equals(other);
    }

    public static DayType of(char symbol) {
        for (DayType v : DayType.values()) {
            if (v.symbol == symbol) return v;
        }
        throw new IllegalArgumentException("Unknown day type");
    }

}
