import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquashTheBugsTest {

    @Test
    public void basicTests() {
        assertEquals(7, SquashTheBugs.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, SquashTheBugs.findLongest("Take me to tinseltown with you"));
        assertEquals(7, SquashTheBugs.findLongest("Sausage chops"));
        assertEquals(6, SquashTheBugs.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, SquashTheBugs.findLongest("Lets all go on holiday"));
    }
}