package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BelowAverageMonthsTest {

    @Test
    public void shouldFindBelowAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelow = 5;
        int actualMonthsBelow = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);
    }
}
