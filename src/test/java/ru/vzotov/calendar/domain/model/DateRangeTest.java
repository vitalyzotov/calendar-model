package ru.vzotov.calendar.domain.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIterable;
import static org.assertj.core.api.Assertions.assertThatIterator;

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

    @Test
    public void testIterator() {
        final DateRange<LocalDate> range = DateRange.of(LocalDate.parse("2023-01-04"), LocalDate.parse("2023-01-06"));
        assertThatIterable(range).containsSequence(
                LocalDate.parse("2023-01-04"),
                LocalDate.parse("2023-01-05"),
                LocalDate.parse("2023-01-06")
        );
    }
}
