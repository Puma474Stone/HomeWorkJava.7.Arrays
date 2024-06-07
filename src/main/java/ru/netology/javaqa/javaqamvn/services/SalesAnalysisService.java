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
}

