package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void shouldFindMinSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long expectedMonth = 8;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }


    @Test
    public void shouldFindMaxSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long expectedMonth = 6;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumAll() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long sumAll = 160;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(sumAll, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long expectedSum = 14;
        long actualSum = service.averageSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMinBelowAverage() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long expectedMinBelow = 3;
        long averageSales = service.averageSum(sales);
        long monthsBelowAverage = service.belowAverage(sales, averageSales);
        Assertions.assertEquals(expectedMinBelow, monthsBelowAverage);

    }

    @Test
    public void shouldFindMMaxBelowAverage() {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long expectedMaxBelow = 6;
        long actualBelow = service.countMonthsAboveAverage(sales);
        Assertions.assertEquals(expectedMaxBelow, actualBelow);

    }

}

