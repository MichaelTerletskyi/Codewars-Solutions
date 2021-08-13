import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class WatermelonTest {

    @Test
    public void basicTests() {
        assertTrue(Watermelon.divide(4));
        assertFalse(Watermelon.divide(2));
        assertFalse(Watermelon.divide(5));
        assertTrue(Watermelon.divide(88));
        assertTrue(Watermelon.divide(100));
        assertFalse(Watermelon.divide(67));
        assertTrue(Watermelon.divide(90));
        assertTrue(Watermelon.divide(10));
        assertFalse(Watermelon.divide(99));
        assertTrue(Watermelon.divide(32));
    }
}