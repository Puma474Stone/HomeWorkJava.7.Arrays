package ru.netology.javaqa.javaqamvn.services;


public class Main {
    public static void main(String[] args) {
        SalesAnalysisService service = new SalesAnalysisService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 7, 14, 14, 18};
        long averageSales = service.averageSum(sales);
        System.out.println("Средняя сумма продаж: " + averageSales);

        int monthsBelowAverage = service.belowAverage(sales, averageSales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthsBelowAverage);


    }
}
