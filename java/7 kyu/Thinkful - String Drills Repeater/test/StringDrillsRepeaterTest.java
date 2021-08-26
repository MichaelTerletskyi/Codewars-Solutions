import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringDrillsRepeaterTest {

    @Test
    public void testSomething() {
        assertEquals("aaaaa", StringDrillsRepeater.repeat("a", 5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", StringDrillsRepeater.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ", StringDrillsRepeater.repeat("Wub ", 6));
    }
}