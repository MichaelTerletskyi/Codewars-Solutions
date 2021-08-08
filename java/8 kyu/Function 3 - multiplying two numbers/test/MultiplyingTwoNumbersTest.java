import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyingTwoNumbersTest {
    private MultiplyingTwoNumbers twoNumbers = new MultiplyingTwoNumbers();

    @Test
    public void sampleTest() {
        assertEquals(4, twoNumbers.multiply(2, 2));
        assertEquals(10, twoNumbers.multiply(5, 2));
        assertEquals(100, twoNumbers.multiply(100, 1));
        assertEquals(0, twoNumbers.multiply(0, 1000));
    }
}