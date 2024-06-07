package ru.netology.javaqa.javaqamvn.services;

public class SalesAnalysisService {
    public int calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public int countMonthsAboveAverage(int[] array) {
        int average = calculateAverage(array);
        int count = 0;
        for (int num : array) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    public int averageSum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) sum / array.length;
    }

    public int belowAverage(int[] arr, int average) {
        int count = 0;
        for (int num : arr) {
            if (num < average) {
                count++;
            }
        }
        return count;

    }

    public int sumSales(int[] sales) {
        int sumAll = 0;

        for (int num : sales) {
            sumAll += num;
        }
        return sumAll;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


}

