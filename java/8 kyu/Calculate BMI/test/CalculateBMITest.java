import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateBMITest {
    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }
}