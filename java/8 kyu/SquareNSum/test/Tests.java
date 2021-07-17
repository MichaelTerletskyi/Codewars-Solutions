import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Create 7/17/2021
 */

public class Tests {

    /**
     * Main solution tests
     */
    @Test
    public void testBasic() {
        assertEquals(9, Kata.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, Kata.squareSum(new int[]{1, 2}));
        assertEquals(50, Kata.squareSum(new int[]{5, -3, 4}));
    }

    @Test
    public void myTest() {
        assertEquals(385, Kata.squareSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(0, Kata.squareSum(new int[]{0}));
        assertEquals(4767, Kata.squareSum(new int[]{23, 42, 3, -44, 23}));
        assertEquals(20004, Kata.squareSum(new int[]{100, -100, 2}));
        assertEquals(1856927, Kata.squareSum(new int[]{1234, 567, 89, 0 - 69}));
        assertEquals(81, Kata.squareSum(new int[]{-9}));
    }


    /**
     * Second solution tests
     */
    @Test
    public void testBasicSecondSolution() {
        assertEquals(9, Kata.squareSumSecondSolution(new int[]{1, 2, 2}));
        assertEquals(5, Kata.squareSumSecondSolution(new int[]{1, 2}));
        assertEquals(50, Kata.squareSumSecondSolution(new int[]{5, -3, 4}));
    }

    @Test
    public void myTestSecondSolution() {
        assertEquals(385, Kata.squareSumSecondSolution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(0, Kata.squareSumSecondSolution(new int[]{0}));
        assertEquals(4767, Kata.squareSumSecondSolution(new int[]{23, 42, 3, -44, 23}));
        assertEquals(20004, Kata.squareSumSecondSolution(new int[]{100, -100, 2}));
        assertEquals(1856927, Kata.squareSumSecondSolution(new int[]{1234, 567, 89, 0 - 69}));
        assertEquals(81, Kata.squareSumSecondSolution(new int[]{-9}));
    }


    /**
     * Third solution tests
     */
    @Test
    public void testBasicThirdSolution() {
        assertEquals(9, Kata.squareSumThirdSolution(new int[]{1, 2, 2}));
        assertEquals(5, Kata.squareSumThirdSolution(new int[]{1, 2}));
        assertEquals(50, Kata.squareSumThirdSolution(new int[]{5, -3, 4}));
    }

    @Test
    public void myTestThirdSolution() {
        assertEquals(385, Kata.squareSumThirdSolution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(0, Kata.squareSumThirdSolution(new int[]{0}));
        assertEquals(4767, Kata.squareSumThirdSolution(new int[]{23, 42, 3, -44, 23}));
        assertEquals(20004, Kata.squareSumThirdSolution(new int[]{100, -100, 2}));
        assertEquals(1856927, Kata.squareSumThirdSolution(new int[]{1234, 567, 89, 0 - 69}));
        assertEquals(81, Kata.squareSumThirdSolution(new int[]{-9}));
    }
}