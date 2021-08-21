import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DotsReplacerTest {

    @Test
    public void testSomeDots() {
        assertEquals("Sorry, try again :-(", "one-two-three", DotsReplacer.replaceDots("one.two.three"));
    }
}