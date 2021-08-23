import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNExclamationTest {

    @Test
    public void fixedTests() {
//        assertEquals("Hi", RemoveNExclamation.remove("Hi!", 1));
//        assertEquals("Hi", RemoveNExclamation.remove("Hi!", 100));
        assertEquals("Hi!!", RemoveNExclamation.remove("Hi!!!", 1));
        assertEquals("Hi", RemoveNExclamation.remove("Hi!!!", 100));
        assertEquals("Hi", RemoveNExclamation.remove("!Hi", 1));
        assertEquals("Hi!", RemoveNExclamation.remove("!Hi!", 1));
        assertEquals("Hi", RemoveNExclamation.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", RemoveNExclamation.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", RemoveNExclamation.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", RemoveNExclamation.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", RemoveNExclamation.remove("!!!Hi !!hi!!! !hi", 100));
    }
}