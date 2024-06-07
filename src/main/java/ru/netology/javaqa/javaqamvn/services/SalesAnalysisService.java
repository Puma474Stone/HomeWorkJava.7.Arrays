package ru.netology.javaqa.javaqamvn.services;

public class SalesAnalysisService {
    public long calculateAverage(long[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public long countMonthsAboveAverage(long[] array) {
        long average = calculateAverage(array);
        int count = 0;
        for (long num : array) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    public long averageSum(long[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return (long) sum / array.length;
    }

    public long belowAverage(long[] arr, long average) {
        long count = 0;
        for (long num : arr) {
            if (num < average) {
                count++;
            }
        }
        return count;

    }

    public long sumSales(long[] sales) {
        long sumAll = 0;

        for (long num : sales) {
            sumAll += num;
        }
        return sumAll;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[ i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


}

