import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @Create 7/23/2021
 */

public class DigitizeExampleTests {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
    }
}