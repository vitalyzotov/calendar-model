package ru.vzotov.calendar.domain.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static java.time.Month.APRIL;
import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;
import static java.time.Month.JUNE;
import static java.time.Month.MARCH;
import static java.time.Month.MAY;
import static java.time.Month.NOVEMBER;
import static ru.vzotov.calendar.domain.model.DayType.HOLIDAY;
import static ru.vzotov.calendar.domain.model.DayType.WEEKEND;
import static ru.vzotov.calendar.domain.model.DayType.WORKING;

public class WorkCalendars {

    public static final String RUSSIA = "RUS";

    public static final WorkCalendar CALENDAR_2039 = new WorkCalendar(
            LocalDate.of(2039, JANUARY, 1),
            LocalDate.of(2039, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2039, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, MAY, 2), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, JUNE, 13), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2039, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2038 = new WorkCalendar(
            LocalDate.of(2038, JANUARY, 1),
            LocalDate.of(2038, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2038, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, MAY, 3), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, MAY, 10), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, JUNE, 14), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2038, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2037 = new WorkCalendar(
            LocalDate.of(2037, JANUARY, 1),
            LocalDate.of(2037, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2037, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, MARCH, 9), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, MAY, 11), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2037, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2036 = new WorkCalendar(
            LocalDate.of(2036, JANUARY, 1),
            LocalDate.of(2036, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2036, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, FEBRUARY, 25), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, MARCH, 10), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2036, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2035 = new WorkCalendar(
            LocalDate.of(2035, JANUARY, 1),
            LocalDate.of(2035, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2035, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2035, NOVEMBER, 5), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2034 = new WorkCalendar(
            LocalDate.of(2034, JANUARY, 1),
            LocalDate.of(2034, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2034, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2034, NOVEMBER, 6), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2033 = new WorkCalendar(
            LocalDate.of(2033, JANUARY, 1),
            LocalDate.of(2033, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2033, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, MAY, 2), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, JUNE, 13), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2033, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2032 = new WorkCalendar(
            LocalDate.of(2032, JANUARY, 1),
            LocalDate.of(2032, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2032, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, MAY, 3), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, MAY, 10), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, JUNE, 14), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2032, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2031 = new WorkCalendar(
            LocalDate.of(2031, JANUARY, 1),
            LocalDate.of(2031, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2031, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, FEBRUARY, 24), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, MARCH, 10), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2031, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2030 = new WorkCalendar(
            LocalDate.of(2030, JANUARY, 1),
            LocalDate.of(2030, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2030, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, FEBRUARY, 25), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2030, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2029 = new WorkCalendar(
            LocalDate.of(2029, JANUARY, 1),
            LocalDate.of(2029, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2029, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2029, NOVEMBER, 5), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2028 = new WorkCalendar(
            LocalDate.of(2028, JANUARY, 1),
            LocalDate.of(2028, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2028, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2028, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2027 = new WorkCalendar(
            LocalDate.of(2027, JANUARY, 1),
            LocalDate.of(2027, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2027, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, MAY, 3), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, MAY, 10), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, JUNE, 14), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2027, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2026 = new WorkCalendar(
            LocalDate.of(2026, JANUARY, 1),
            LocalDate.of(2026, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2026, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, MARCH, 9), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, MAY, 11), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2026, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2025 = new WorkCalendar(
            LocalDate.of(2025, JANUARY, 1),
            LocalDate.of(2025, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2025, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, FEBRUARY, 24), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, MARCH, 10), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2025, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2024 = new WorkCalendar(
            LocalDate.of(2024, JANUARY, 1),
            LocalDate.of(2024, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2024, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2024, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2023 = new WorkCalendar(
            LocalDate.of(2023, JANUARY, 1),
            LocalDate.of(2023, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2023, FEBRUARY, 24), RUSSIA, "Перенос с воскресенья 1 января на пятницу 24 февраля", WEEKEND),
                    new SpecialDay(LocalDate.of(2023, MAY, 8), RUSSIA, "Перенос с воскресенья 8 января на понедельник 8 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY),
                    new SpecialDay(LocalDate.of(2023, NOVEMBER, 6), RUSSIA, "Перенос с субботы 4 ноября на понедельник 6 ноября", WEEKEND)
            )
    );

    public static final WorkCalendar CALENDAR_2022 = new WorkCalendar(
            LocalDate.of(2022, JANUARY, 1),
            LocalDate.of(2022, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2022, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, JUNE, 13), RUSSIA, "с воскресенья 12 июня на понедельник 13 июня", WEEKEND),
                    new SpecialDay(LocalDate.of(2022, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY),
                    new SpecialDay(LocalDate.of(2022, MARCH, 7), RUSSIA, "с субботы 5 марта на понедельник 7 марта", WEEKEND),
                    new SpecialDay(LocalDate.of(2022, MAY, 2), RUSSIA, "с воскресенья 1 мая на понедельник 2 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2022, MAY, 3), RUSSIA, "с субботы 1 января на вторник 3 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2022, MAY, 10), RUSSIA, "с воскресенья 2 января на вторник 10 мая", WEEKEND)
            )
    );

    public static final WorkCalendar CALENDAR_2021 = new WorkCalendar(
            LocalDate.of(2021, JANUARY, 1),
            LocalDate.of(2021, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2021, FEBRUARY, 20), RUSSIA, "Перенос с субботы 20 февраля на понедельник 22 февраля", DayType.WORKING),
                    new SpecialDay(LocalDate.of(2021, FEBRUARY, 22), RUSSIA, "Перенос с субботы 20 февраля на понедельник 22 февраля", WEEKEND),
                    new SpecialDay(LocalDate.of(2021, NOVEMBER, 5), RUSSIA, "Перенос с субботы 2 января на пятницу 5 ноября", WEEKEND),
                    new SpecialDay(LocalDate.of(2021, DECEMBER, 31), RUSSIA, "Перенос с воскресенья 3 января на пятницу 31 декабря", WEEKEND),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, MAY, 3), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, MAY, 10), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, JUNE, 14), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2021, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2020 = new WorkCalendar(
            LocalDate.of(2020, JANUARY, 1),
            LocalDate.of(2020, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2020, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, FEBRUARY, 24), RUSSIA, "Перенос с воскресенья 23 февраля на понедельник 24 февраля", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, MARCH, 9), RUSSIA, "Перенос с воскресенья 8 марта на понедельник 9 марта", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, MAY, 4), RUSSIA, "Перенос с субботы 4 января на понедельник 4 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, MAY, 5), RUSSIA, "Перенос с воскресенья 5 января на вторник 5 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, MAY, 11), RUSSIA, "Перенос с субботы 9 мая на понедельник 11 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2020, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2020_COVID19 = new WorkCalendar(
            LocalDate.of(2020, MARCH, 30),
            LocalDate.of(2020, Month.APRIL, 30),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2020, MARCH, 30), RUSSIA, "COVID19", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, MARCH, 31), RUSSIA, "COVID19", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 1), RUSSIA, "COVID19", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 2), RUSSIA, "COVID19", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 3), RUSSIA, "COVID19", WEEKEND),
                    new SpecialDay(LocalDate.of(2020, Month.APRIL, 4), RUSSIA, "COVID19", WEEKEND)
            )
    );


    public static final WorkCalendar CALENDAR_2019 = new WorkCalendar(
            LocalDate.of(2019, JANUARY, 1),
            LocalDate.of(2019, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2019, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    // february
                    new SpecialDay(LocalDate.of(2019, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    // march
                    new SpecialDay(LocalDate.of(2019, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    // may
                    new SpecialDay(LocalDate.of(2019, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, MAY, 2), RUSSIA, "Перенос с субботы 5 января на четверг 2 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2019, MAY, 3), RUSSIA, "Перенос с воскресенья 6 января на пятницу 3 мая", WEEKEND),
                    new SpecialDay(LocalDate.of(2019, MAY, 10), RUSSIA, "Перенос с субботы 23 февраля на пятницу 10 мая", WEEKEND),
                    // june
                    new SpecialDay(LocalDate.of(2019, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2019, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
            )
    );

    public static final WorkCalendar CALENDAR_2018 = new WorkCalendar(
            LocalDate.of(2018, JANUARY, 1),
            LocalDate.of(2018, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2018, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    // february
                    new SpecialDay(LocalDate.of(2018, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    // march
                    new SpecialDay(LocalDate.of(2018, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, MARCH, 9), RUSSIA, "Перенос с субботы 6 января на пятницу 9 марта", WEEKEND),
                    // april
                    new SpecialDay(LocalDate.of(2018, APRIL, 28), RUSSIA, "Перенос с субботы 28 апреля на понедельник 30 апреля", WORKING),
                    new SpecialDay(LocalDate.of(2018, APRIL, 30), RUSSIA, "Перенос с субботы 28 апреля на понедельник 30 апреля", WEEKEND),

                    // may
                    new SpecialDay(LocalDate.of(2018, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, MAY, 2), RUSSIA, "Перенос с воскресенья 7 января на среду 2 мая", WEEKEND),
                    // june
                    new SpecialDay(LocalDate.of(2018, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    new SpecialDay(LocalDate.of(2018, JUNE, 9), RUSSIA, "Перенос с субботы 9 июня на понедельник 11 июня", WORKING),
                    new SpecialDay(LocalDate.of(2018, JUNE, 11), RUSSIA, "Перенос с субботы 9 июня на понедельник 11 июня", WEEKEND),
                    // november
                    new SpecialDay(LocalDate.of(2018, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY),
                    // december
                    new SpecialDay(LocalDate.of(2018, DECEMBER, 29), RUSSIA, "Перенос с субботы 29 декабря на понедельник 31 декабря", WORKING),
                    new SpecialDay(LocalDate.of(2018, DECEMBER, 31), RUSSIA, "Перенос с субботы 29 декабря на понедельник 31 декабря", WEEKEND)
            )
    );

    public static final WorkCalendar CALENDAR_2017 = new WorkCalendar(
            LocalDate.of(2017, JANUARY, 1),
            LocalDate.of(2017, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2017, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    // february
                    new SpecialDay(LocalDate.of(2017, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, FEBRUARY, 24), RUSSIA, "Перенос с воскресенья 1 января на пятницу 24 февраля", WEEKEND),
                    // march
                    new SpecialDay(LocalDate.of(2017, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    // april

                    // may
                    new SpecialDay(LocalDate.of(2017, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2017, MAY, 8), RUSSIA, "Перенос с субботы 7 января на понедельник 8 мая", WEEKEND),
                    // june
                    new SpecialDay(LocalDate.of(2017, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    // november
                    new SpecialDay(LocalDate.of(2017, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
                    // december
            )
    );

    public static final WorkCalendar CALENDAR_2016 = new WorkCalendar(
            LocalDate.of(2016, JANUARY, 1),
            LocalDate.of(2016, DECEMBER, 31),
            RUSSIA,
            Arrays.asList(
                    new SpecialDay(LocalDate.of(2016, JANUARY, 1), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 2), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 3), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 4), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 5), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 6), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 7), RUSSIA, "Рождество Христово", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, JANUARY, 8), RUSSIA, "Новогодние каникулы", HOLIDAY),
                    // february
                    new SpecialDay(LocalDate.of(2016, FEBRUARY, 23), RUSSIA, "День защитника Отечества", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, FEBRUARY, 20), RUSSIA, "Перенос с субботы 20 февраля на понедельник 22 февраля", WORKING),
                    new SpecialDay(LocalDate.of(2016, FEBRUARY, 22), RUSSIA, "Перенос с субботы 20 февраля на понедельник 22 февраля", WEEKEND),
                    // march
                    new SpecialDay(LocalDate.of(2016, MARCH, 8), RUSSIA, "Международный женский день", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, MARCH, 7), RUSSIA, "Перенос с воскресенья 3 января на понедельник 7 марта", WEEKEND),
                    // april

                    // may
                    new SpecialDay(LocalDate.of(2016, MAY, 1), RUSSIA, "Праздник Весны и Труда", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, MAY, 9), RUSSIA, "День Победы", HOLIDAY),
                    new SpecialDay(LocalDate.of(2016, MAY, 3), RUSSIA, "Перенос с субботы 2 января на вторник 3 мая", WEEKEND),
                    // june
                    new SpecialDay(LocalDate.of(2016, JUNE, 12), RUSSIA, "День России", HOLIDAY),
                    // november
                    new SpecialDay(LocalDate.of(2016, NOVEMBER, 4), RUSSIA, "День народного единства", HOLIDAY)
                    // december
            )
    );

    public static WorkCalendar forDate(LocalDate date) {
        return switch (date.getYear()) {
            case 2016 -> CALENDAR_2016;
            case 2017 -> CALENDAR_2017;
            case 2018 -> CALENDAR_2018;
            case 2019 -> CALENDAR_2019;
            case 2020 -> CALENDAR_2020;
            case 2021 -> CALENDAR_2021;
            case 2022 -> CALENDAR_2022;
            case 2023 -> CALENDAR_2023;
            case 2024 -> CALENDAR_2024;
            case 2025 -> CALENDAR_2025;
            case 2026 -> CALENDAR_2026;
            case 2027 -> CALENDAR_2027;
            case 2028 -> CALENDAR_2028;
            case 2029 -> CALENDAR_2029;
            case 2030 -> CALENDAR_2030;
            case 2031 -> CALENDAR_2031;
            case 2032 -> CALENDAR_2032;
            case 2033 -> CALENDAR_2033;
            case 2034 -> CALENDAR_2034;
            case 2035 -> CALENDAR_2035;
            case 2036 -> CALENDAR_2036;
            case 2037 -> CALENDAR_2037;
            case 2038 -> CALENDAR_2038;
            case 2039 -> CALENDAR_2039;
            default -> null;
        };
    }
}
