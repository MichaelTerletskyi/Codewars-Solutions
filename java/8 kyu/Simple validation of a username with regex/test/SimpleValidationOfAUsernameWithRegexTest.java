import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleValidationOfAUsernameWithRegexTest {

    @Test
    public void basicTests() {
        assertEquals(true, SimpleValidationOfAUsernameWithRegex.validateUsr("regex"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr("a"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr("Hass"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr(""));
        assertEquals(true, SimpleValidationOfAUsernameWithRegex.validateUsr("____"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr("012"));
        assertEquals(true, SimpleValidationOfAUsernameWithRegex.validateUsr("p1pp1"));
        assertEquals(false, SimpleValidationOfAUsernameWithRegex.validateUsr("asd43 34"));
        assertEquals(true, SimpleValidationOfAUsernameWithRegex.validateUsr("asd43_34"));
    }
}