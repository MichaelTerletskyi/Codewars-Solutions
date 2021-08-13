import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllStarCodeChallengeTest {

    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallenge.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge.strCount("", 'z'));
    }
}