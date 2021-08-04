import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HolidayEightDutyFreeTest {
    @Test
    public void fixedTests() {
        assertEquals(166, HolidayEightDutyFree.dutyFree(12, 50, 1000));
        assertEquals(294, HolidayEightDutyFree.dutyFree(17, 10, 500));
        assertEquals(357, HolidayEightDutyFree.dutyFree(24, 35, 3000));
        assertEquals(20, HolidayEightDutyFree.dutyFree(1400, 35, 10000));
        assertEquals(38, HolidayEightDutyFree.dutyFree(700, 26, 7000));
    }
}