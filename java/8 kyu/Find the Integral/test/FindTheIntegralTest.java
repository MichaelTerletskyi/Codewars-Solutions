import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheIntegralTest {

    @Test
    public void exampleTests() {
        assertEquals("1x^3", FindTheIntegral.integrate(3, 2));
        assertEquals("2x^6", FindTheIntegral.integrate(12, 5));
        assertEquals("10x^2", FindTheIntegral.integrate(20, 1));
        assertEquals("10x^4", FindTheIntegral.integrate(40, 3));
        assertEquals("30x^3", FindTheIntegral.integrate(90, 2));
    }
}