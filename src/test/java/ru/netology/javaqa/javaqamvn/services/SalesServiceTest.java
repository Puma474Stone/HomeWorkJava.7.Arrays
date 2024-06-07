package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void shouldFindMinSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }


    @Test
    public void shouldFindMaxSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumAll() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int sumAll = 160;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(sumAll, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int expectedSum = 14;
        int actualSum = service.averageSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMinBelowAverage() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int expectedMinBelow = 3;
        int averageSales = service.averageSum(sales);
        int monthsBelowAverage = service.belowAverage(sales, averageSales);
        Assertions.assertEquals(expectedMinBelow, monthsBelowAverage);

    }

    @Test
    public void shouldFindMMaxBelowAverage() {
        SalesAnalysisService service = new SalesAnalysisService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        int expectedMaxBelow = 6;
        int actualBelow = service.countMonthsAboveAverage(sales);
        Assertions.assertEquals(expectedMaxBelow, actualBelow);

    }

}

