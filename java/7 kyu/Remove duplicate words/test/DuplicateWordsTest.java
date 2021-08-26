import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateWordsTest {

    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", DuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", DuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }
}