import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest4 {
    @Test
    public void fixedTests() {
        assertEquals(166, Kata5.dutyFree(12, 50, 1000));
        assertEquals(294, Kata5.dutyFree(17, 10, 500));
        assertEquals(357, Kata5.dutyFree(24, 35, 3000));
        assertEquals(20, Kata5.dutyFree(1400, 35, 10000));
        assertEquals(38, Kata5.dutyFree(700, 26, 7000));
    }
}