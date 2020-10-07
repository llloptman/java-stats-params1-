package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesAmount() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 180;
        int actual = service.salesAmount(data);

        assertEquals(expectedResult,actual);
    }


    @Test
    void avrSalesPerMonth() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 15;
        int actual = service.avrSalesPerMonth(data);

       assertEquals(expectedResult,actual);
    }

    @Test
    void highestSaleMonth() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 8;
        int actual = service.highestSaleMonth(data);

        assertEquals(expectedResult,actual);
    }

    @Test
    void lowestSaleMonth() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 9;
        int actual = service.lowestSaleMonth(data);

        assertEquals(expectedResult,actual);
    }

    @Test
    void countMonthsOverAvr() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;
        int actual = service.countMonthsOverAvr(data);

        assertEquals(expectedResult,actual);
    }

    @Test
    void countMonthsUnderAvr() {
        StatsService service = new StatsService();
        int[] data = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;
        int actual = service.countMonthsUnderAvr(data);

        assertEquals(expectedResult,actual);
    }
}