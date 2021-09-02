import org.junit.Test;

import static org.junit.Assert.*;

public class HighestAndLowestTest {

    @Test
    public void test1() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
