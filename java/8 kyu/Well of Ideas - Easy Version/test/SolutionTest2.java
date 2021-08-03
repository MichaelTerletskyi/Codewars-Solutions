import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest2 {
    @Test
    public void basicTests() {
        assertEquals("Fail!", Kata4.well(new String[]{"bad", "bad", "bad"}));
        assertEquals("Publish!", Kata4.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", Kata4.well(new String[]{
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}