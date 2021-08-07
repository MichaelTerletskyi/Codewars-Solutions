import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperPersonalizedMessageTest {

    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", GrasshopperPersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", GrasshopperPersonalizedMessage.greet("Greg", "Daniel"));
    }
}