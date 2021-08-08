import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAndMinimumValuesOfAListTest {
    private MaximumAndMinimumValuesOfAList kata = new MaximumAndMinimumValuesOfAList();

    @Test
    public void testExamples() {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        assertEquals(5, kata.max(new int[]{5}));
    }
}