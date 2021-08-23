import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTemplatesBugFixingTest {

    @Test
    public void fixedTests() {
        assertEquals(StringTemplatesBugFixing.buildString("Cheese", "Milk", "Chocolate"), "I like Cheese, Milk, Chocolate!");
        assertEquals(StringTemplatesBugFixing.buildString("Cheese", "Milk"), "I like Cheese, Milk!");
        assertEquals(StringTemplatesBugFixing.buildString("Chocolate"), "I like Chocolate!");
    }
}