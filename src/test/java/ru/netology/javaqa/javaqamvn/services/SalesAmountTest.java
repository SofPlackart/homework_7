package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesAmountTest {

    @Test
    public void shouldFindSalesSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.getSalesSum(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        int actualAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindTheFirstMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;
        int actualMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindTheFirstMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBelowAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelow = 5;
        int actualMonthsBelow = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);
    }

    @Test
    public void shouldFindAboveAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAbove = 5;
        int actualMonthsAbove = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthsAbove, actualMonthsAbove);
    }
}
