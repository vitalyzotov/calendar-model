package ru.vzotov.calendar.domain.model;

import ru.vzotov.ddd.shared.ValueObject;

public enum RecurrenceUnit implements ValueObject<RecurrenceUnit> {
    MONTHLY('M'), WEEKLY('W'), DATE('T');

    private char symbol;

    RecurrenceUnit(char symbol) {
        this.symbol = symbol;
    }

    public char symbol() {
        return symbol;
    }

    @Override
    public boolean sameValueAs(RecurrenceUnit other) {
        return this.equals(other);
    }

    public static RecurrenceUnit of(char symbol) {
        for (RecurrenceUnit v : RecurrenceUnit.values()) {
            if (v.symbol == symbol) return v;
        }
        throw new IllegalArgumentException("Unknown unit");
    }

}
