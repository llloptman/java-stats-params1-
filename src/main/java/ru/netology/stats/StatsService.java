package ru.netology.stats;

public class StatsService {


    public int salesAmount(int[] data) {
        int salesSumm = 0;
        for (int datum : data) {
            salesSumm += datum;
        }
        return salesSumm;
    }

    public int avrSalesPerMonth(int[] data) {
        int salesSumm = salesAmount(data);
        return salesSumm / data.length;
    }

    public int highestSaleMonth(int[] data) {
        int salesMaximum = data[0];
        int month = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= salesMaximum) {
                salesMaximum = data[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int lowestSaleMonth(int[] data) {
        int salesMinimum = data[0];
        int month = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= salesMinimum) {
                salesMinimum = data[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int countMonthsOverAvr(int[] data) {
       int avr = avrSalesPerMonth(data);
        int countMonths = 0;
        for (int datum : data) {
            if (datum > avr) {
                countMonths += 1;
            }
        }

        return countMonths;
    }

    public int countMonthsUnderAvr(int[] data) {
        int avr = avrSalesPerMonth(data);
        int countMonths = 0;
        for (int datum : data) {
            if (datum < avr) {
                countMonths += 1;
            }
        }

        return countMonths;
    }

}
