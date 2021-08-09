import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestUnusedIDTest {

    @Test
    public void fixedTests() {
        assertEquals(4, SmallestUnusedID.nextId(new int[]{0, 1, 2, 3, 5}));
        assertEquals(4, SmallestUnusedID.nextId(new int[]{1, 2, 0, 2, 3}));
        assertEquals(4, SmallestUnusedID.nextId(new int[]{1, 2, 0, 2, 3, 5}));
        assertEquals(11, SmallestUnusedID.nextId(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(0, SmallestUnusedID.nextId(new int[]{2, 2, 3, 4, 4, 8, 8, 8, 8, 10}));
        assertEquals(0, SmallestUnusedID.nextId(new int[]{1, 2, 2, 4, 5, 7, 7, 9, 10, 10, 14, 14}));
        assertEquals(2, SmallestUnusedID.nextId(new int[]{9, 13, 12, 4, 1, 12, 0, 13, 0, 12, 14, 11, 10, 13, 6, 6, 6, 9, 1, 3, 8, 10, 9, 4, 4}));
    }
}