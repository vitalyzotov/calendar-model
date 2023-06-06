package ru.vzotov.calendar.domain.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkCalendarTest {

    @Test
    public void testCalendar() {
        WorkCalendar calendar = WorkCalendars.CALENDAR_2020;

        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.JANUARY, 4))).isEqualTo(DayType.HOLIDAY);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.JANUARY, 9))).isEqualTo(DayType.WORKING);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.JANUARY, 10))).isEqualTo(DayType.WORKING);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.JANUARY, 11))).isEqualTo(DayType.WEEKEND);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.FEBRUARY, 23))).isEqualTo(DayType.HOLIDAY);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.FEBRUARY, 24))).isEqualTo(DayType.WEEKEND);
        assertThat(calendar.typeOfDay(LocalDate.of(2020, Month.JUNE, 13))).isEqualTo(DayType.WEEKEND);
        assertThat(calendar.workdaysBetween(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 15))).isEqualTo(5);
        assertThat(calendar.workdaysBetween(LocalDate.of(2020, Month.JANUARY, 16), LocalDate.of(2020, Month.JANUARY, 31))).isEqualTo(12);
    }
}
