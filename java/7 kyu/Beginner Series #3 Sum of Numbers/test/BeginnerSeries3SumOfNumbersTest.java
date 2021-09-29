import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeginnerSeries3SumOfNumbersTest {

    BeginnerSeries3SumOfNumbers s = new BeginnerSeries3SumOfNumbers();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}