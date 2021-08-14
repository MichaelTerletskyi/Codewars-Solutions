import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperMessiGoalsTest {
    @Test
    public void basicTests() {
        assertEquals(0, GrasshopperMessiGoals.goals(0, 0, 0));
        assertEquals(58, GrasshopperMessiGoals.goals(43, 10, 5));
    }
}