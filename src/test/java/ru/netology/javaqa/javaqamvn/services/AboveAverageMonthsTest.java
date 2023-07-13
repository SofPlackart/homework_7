package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AboveAverageMonthsTest {

    @Test
    public void shouldFindAboveAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAbove = 5;
        int actualMonthsAbove = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthsAbove, actualMonthsAbove);
    }
}
