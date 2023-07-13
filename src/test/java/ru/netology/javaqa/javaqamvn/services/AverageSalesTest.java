package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageSalesTest {

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        int actualAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}
