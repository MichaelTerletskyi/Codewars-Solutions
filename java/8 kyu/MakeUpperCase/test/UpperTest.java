import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperTest {

    @Test
    public void testSomething() {
        assertEquals("HELLO", Upper.MakeUpperCase("hello"));
    }
}