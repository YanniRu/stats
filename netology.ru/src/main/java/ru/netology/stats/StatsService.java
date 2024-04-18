package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int getSumSales(int[] sales) {

        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    // Средняя сумма продаж в месяц
    public int getAverageSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    // номер месяца, в котором был пик продаж
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    // номер месяца, в котором был минимум продаж
    public int getMinMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int belowCalcAverageMonth(int[] sales) {
        int avg = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        avg = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count = count + 1;
            }
        }
        return count;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int aboveCalcAverageMonth(int[] sales) {
        int avg = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        avg = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count = count + 1;
            }
        }
        return count;
    }
}







