import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class EnumerableMagic25TakeTheFirstNElementsTest {

    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, EnumerableMagic25TakeTheFirstNElements.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}