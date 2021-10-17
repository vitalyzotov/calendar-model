package ru.vzotov.calendar.domain.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class WorkCalendars {

    public static final String RUSSIA = "RUS";

    public static final WorkCalendar CALENDAR_2039 = new WorkCalendar(
            LocalDate.of(2039, Month.JANUARY, 1),
            LocalDate.of(2039, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.MAY, 2), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.JUNE, 13), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2038 = new WorkCalendar(
            LocalDate.of(2038, Month.JANUARY, 1),
            LocalDate.of(2038, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.MAY, 3), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.MAY, 10), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.JUNE, 14), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2037 = new WorkCalendar(
            LocalDate.of(2037, Month.JANUARY, 1),
            LocalDate.of(2037, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.MARCH, 9), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.MAY, 11), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2036 = new WorkCalendar(
            LocalDate.of(2036, Month.JANUARY, 1),
            LocalDate.of(2036, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.FEBRUARY, 25), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.MARCH, 10), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2035 = new WorkCalendar(
            LocalDate.of(2035, Month.JANUARY, 1),
            LocalDate.of(2035, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, Month.NOVEMBER, 5), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2034 = new WorkCalendar(
            LocalDate.of(2034, Month.JANUARY, 1),
            LocalDate.of(2034, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, Month.NOVEMBER, 6), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2033 = new WorkCalendar(
            LocalDate.of(2033, Month.JANUARY, 1),
            LocalDate.of(2033, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.MAY, 2), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.JUNE, 13), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2032 = new WorkCalendar(
            LocalDate.of(2032, Month.JANUARY, 1),
            LocalDate.of(2032, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.MAY, 3), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.MAY, 10), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.JUNE, 14), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2031 = new WorkCalendar(
            LocalDate.of(2031, Month.JANUARY, 1),
            LocalDate.of(2031, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.FEBRUARY, 24), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.MARCH, 10), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2030 = new WorkCalendar(
            LocalDate.of(2030, Month.JANUARY, 1),
            LocalDate.of(2030, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.FEBRUARY, 25), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2029 = new WorkCalendar(
            LocalDate.of(2029, Month.JANUARY, 1),
            LocalDate.of(2029, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, Month.NOVEMBER, 5), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2028 = new WorkCalendar(
            LocalDate.of(2028, Month.JANUARY, 1),
            LocalDate.of(2028, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2027 = new WorkCalendar(
            LocalDate.of(2027, Month.JANUARY, 1),
            LocalDate.of(2027, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.MAY, 3), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.MAY, 10), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.JUNE, 14), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2026 = new WorkCalendar(
            LocalDate.of(2026, Month.JANUARY, 1),
            LocalDate.of(2026, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.MARCH, 9), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.MAY, 11), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2025 = new WorkCalendar(
            LocalDate.of(2025, Month.JANUARY, 1),
            LocalDate.of(2025, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.FEBRUARY, 24), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.MARCH, 10), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2024 = new WorkCalendar(
            LocalDate.of(2024, Month.JANUARY, 1),
            LocalDate.of(2024, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2023 = new WorkCalendar(
            LocalDate.of(2023, Month.JANUARY, 1),
            LocalDate.of(2023, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, Month.NOVEMBER, 6), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2022 = new WorkCalendar(
            LocalDate.of(2022, Month.JANUARY, 1),
            LocalDate.of(2022, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.MAY, 2), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.JUNE, 13), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2021 = new WorkCalendar(
            LocalDate.of(2021, Month.JANUARY, 1),
            LocalDate.of(2021, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.MAY, 3), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.MAY, 10), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.JUNE, 14), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2020 = new WorkCalendar(
            LocalDate.of(2020, Month.JANUARY, 1),
            LocalDate.of(2020, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.FEBRUARY, 24), RUSSIA, "Перенос с воскресенья 23 февраля на понедельник 24 февраля", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.MARCH, 9), RUSSIA, "Перенос с воскресенья 8 марта на понедельник 9 марта", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.MAY, 4), RUSSIA, "Перенос с субботы 4 января на понедельник 4 мая", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.MAY, 5), RUSSIA, "Перенос с воскресенья 5 января на вторник 5 мая", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.MAY, 11), RUSSIA, "Перенос с субботы 9 мая на понедельник 11 мая", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2020_COVID19 = new WorkCalendar(
            LocalDate.of(2020, Month.MARCH, 30),
            LocalDate.of(2020, Month.APRIL, 30),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2020, Month.MARCH, 30), RUSSIA, "COVID19", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.MARCH, 31), RUSSIA, "COVID19", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 1), RUSSIA, "COVID19", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 2), RUSSIA, "COVID19", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 3), RUSSIA, "COVID19", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 4), RUSSIA, "COVID19", DayType.WEEKEND)
            )
    );


    public static final WorkCalendar CALENDAR_2019 = new WorkCalendar(
            LocalDate.of(2019, Month.JANUARY, 1),
            LocalDate.of(2019, Month.DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 1), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 2), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 3), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 4), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 5), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 6), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 7), RUSSIA, "Рождество Христово", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.JANUARY, 8), RUSSIA, "Новогодние каникулы", DayType.HOLIDAY),
                    // february
                    new SpecialDay(LocalDate.of(2019, Month.FEBRUARY, 23), RUSSIA, "День защитника Отечества", DayType.HOLIDAY),
                    // march
                    new SpecialDay(LocalDate.of(2019, Month.MARCH, 8), RUSSIA, "Международный женский день", DayType.HOLIDAY),
                    // may
                    new SpecialDay(LocalDate.of(2019, Month.MAY, 1), RUSSIA, "Праздник Весны и Труда", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.MAY, 9), RUSSIA, "День Победы", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.MAY, 2), RUSSIA, "Перенос с субботы 5 января на четверг 2 мая", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2019, Month.MAY, 3), RUSSIA, "Перенос с воскресенья 6 января на пятницу 3 мая", DayType.WEEKEND),
                    new SpecialDay(LocalDate.of(2019, Month.MAY, 10), RUSSIA, "Перенос с субботы 23 февраля на пятницу 10 мая", DayType.WEEKEND),
                    // june
                    new SpecialDay(LocalDate.of(2019, Month.JUNE, 12), RUSSIA, "День России", DayType.HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, Month.NOVEMBER, 4), RUSSIA, "День народного единства", DayType.HOLIDAY)
            )
    );

}
