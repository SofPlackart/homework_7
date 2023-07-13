package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSalesMonthTest {

    @Test
    public void shouldFindTheFirstMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;
        int actualMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
