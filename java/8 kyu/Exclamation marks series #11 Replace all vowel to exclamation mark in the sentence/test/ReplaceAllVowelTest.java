import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllVowelTest {

    @Test
    public void basicTests() {
        assertEquals("H!!", ReplaceAllVowel.replace("Hi!"));
        assertEquals("!H!! H!!", ReplaceAllVowel.replace("!Hi! Hi!"));
        assertEquals("!!!!!", ReplaceAllVowel.replace("aeiou"));
        assertEquals("!BCD!", ReplaceAllVowel.replace("ABCDE"));
    }
}