import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertAStringToAnArrayTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertAStringToAnArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertAStringToAnArray.stringToArray("I love arrays they are my favorite"));
    }
}