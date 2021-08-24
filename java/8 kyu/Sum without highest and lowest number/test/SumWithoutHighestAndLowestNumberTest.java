import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumWithoutHighestAndLowestNumberTest {

    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[]{6, 2, 1, 8, 10}));
    }

    @Test
    public void nullTest() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(null));
    }

    @Test
    public void emptyArrTest() {
        assertEquals(0, SumWithoutHighestAndLowestNumber.sum(new int[]{}));
    }
}