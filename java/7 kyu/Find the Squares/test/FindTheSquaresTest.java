import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheSquaresTest {

    @Test
    public void testBasicNumbers() {
        assertEquals("25-16", FindTheSquares.findSquares(9));
    }

    @Test
    public void testSmallerNumbers() {
        assertEquals("1-0", FindTheSquares.findSquares(1));
    }

    @Test
    public void testBiggerNumbers() {
        assertEquals("891136-889249", FindTheSquares.findSquares(1887));
        assertEquals("2499600016-2499500025", FindTheSquares.findSquares(99991));
    }
}