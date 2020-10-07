import org.junit.jupiter.api.Test;

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


}