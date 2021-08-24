import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    @Test
    public void exampleTests() {
        assertEquals(5.65d, FuelCalculator.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, FuelCalculator.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, FuelCalculator.fuelPrice(5, 5.6d), 0.001d);
    }
}