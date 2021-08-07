import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaOrPerimeterTest {
    @Test
    public void testSomething() {
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4, 4));
        assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6, 10));
    }
}