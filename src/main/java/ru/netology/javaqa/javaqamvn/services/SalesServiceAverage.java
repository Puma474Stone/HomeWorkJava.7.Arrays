package ru.netology.javaqa.javaqamvn.services;

public class SalesServiceAverage {

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
}
