import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperDebugTest {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrassHopperDebug.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrassHopperDebug.weatherInfo(23));
    }
}