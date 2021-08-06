import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}