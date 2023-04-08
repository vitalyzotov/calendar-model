package ru.vzotov.calendar.domain.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class DateRangeTest {

    @Test
    public void testDateRange() {
        DateRange<LocalDate> localDateDateRange = new DateRange<>(
                LocalDate.of(2021, 1, 20),
                LocalDate.of(2021, 3, 15)
        );
        localDateDateRange = localDateDateRange.startingAt(LocalDate.of(2021, 1, 10))
                .finishingAt(LocalDate.of(2021, 4, 25));

        assertThat(localDateDateRange).isEqualTo(new DateRange<>(
                LocalDate.of(2021, 1, 10),
                LocalDate.of(2021, 4, 25)
        ));
    }

    @Test
    public void testIntersect() {
        assertThat(
                DateRange.of(LocalDate.parse("2022-01-01"), LocalDate.parse("2022-01-31"))
                        .intersect(
                                DateRange.of(LocalDate.parse("2022-01-20"), LocalDate.parse("2022-03-31")),
                                ChronoUnit.DAYS
                        )
        ).isEqualTo(
                DateRange.of(LocalDate.parse("2022-01-20"), LocalDate.parse("2022-01-31"))
        );

        assertThat(
                DateRange.of(LocalDate.parse("2022-01-01"), LocalDate.parse("2022-01-31"))
                        .intersect(
                                DateRange.of(LocalDate.parse("2022-02-01"), LocalDate.parse("2022-02-28")),
                                ChronoUnit.DAYS
                        )
        ).isNull();
    }
}
