import org.junit.Test;

import static org.junit.Assert.*;

public class TheFeastOfManyBeastsTest {

    @Test
    public void fixedTest() {
        assertTrue(TheFeastOfManyBeasts.feast("great blue heron", "garlic nann"));
        assertTrue(TheFeastOfManyBeasts.feast("chickadee", "chocolate cake"));
        assertFalse(TheFeastOfManyBeasts.feast("brown bear", "bear claw"));
    }
}