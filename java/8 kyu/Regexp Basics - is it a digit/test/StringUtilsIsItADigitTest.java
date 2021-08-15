import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringUtilsIsItADigitTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtilsIsItADigit.isDigit(""));
        assertTrue(StringUtilsIsItADigit.isDigit("7"));
        assertFalse(StringUtilsIsItADigit.isDigit(" "));
        assertFalse(StringUtilsIsItADigit.isDigit("a"));
        assertFalse(StringUtilsIsItADigit.isDigit("a5"));
        assertFalse(StringUtilsIsItADigit.isDigit("14"));
    }
}