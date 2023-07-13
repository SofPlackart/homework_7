package ru.netology.javaqa.javaqamvn.services;

public class StatsService {

    public int getSalesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = getSalesSum(sales);
        int averageSales;
        averageSales = sum / sales.length;

        return averageSales;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int months = 0;
        int average = averageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public int salesAboveAverage(int[] sales) {
        int months = 0;
        int average = averageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months = months + 1;
            }
        }
        return months;
    }
}
