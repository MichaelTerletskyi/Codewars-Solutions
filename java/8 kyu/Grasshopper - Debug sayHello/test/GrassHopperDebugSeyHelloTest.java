import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperDebugSeyHelloTest {

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock", GrassHopperDebugSeyHello.sayHello("Mr. Spock"));
    }

    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk", GrassHopperDebugSeyHello.sayHello("Captain Kirk"));
    }

    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura", GrassHopperDebugSeyHello.sayHello("Liutenant Uhura"));
    }

    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy", GrassHopperDebugSeyHello.sayHello("Dr. McCoy"));
    }
}