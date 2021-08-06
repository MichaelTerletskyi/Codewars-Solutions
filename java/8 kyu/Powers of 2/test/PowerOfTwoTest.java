import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PowerOfTwoTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowerOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1, 2}, PowerOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1, 2, 4, 8, 16}, PowerOfTwo.powersOfTwo(4));
    }
}