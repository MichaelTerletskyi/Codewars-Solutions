import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTests7 {

    @Test
    public void testSomeDots() {
        assertEquals("Sorry, try again :-(", "one-two-three", Dinglemouse.replaceDots("one.two.three"));
    }
}