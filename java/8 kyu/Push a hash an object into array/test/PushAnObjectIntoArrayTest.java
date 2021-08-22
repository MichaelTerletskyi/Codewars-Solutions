import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
        List<String> items = PushAnObjectIntoArray.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}