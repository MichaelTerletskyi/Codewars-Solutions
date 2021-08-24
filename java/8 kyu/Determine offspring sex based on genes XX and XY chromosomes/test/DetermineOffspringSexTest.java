import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DetermineOffspringSexTest {

    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", DetermineOffspringSex.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspringSex.chromosomeCheck("XX"));
    }
}