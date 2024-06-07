package ru.netology.javaqa.javaqamvn.services;

public class SalesServiceSumAll {

    public int sumSales(int[] sales) {
        int sumAll = 0;

        for (int num : sales) {
            sumAll += num;
        }
        return sumAll;
    }
}



