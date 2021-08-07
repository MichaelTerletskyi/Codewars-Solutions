import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperTests {

    @Test
    public void test1() {
        assertEquals("Failed at paperWork(5,5)", 25, Paper.paperWork(5, 5));
    }
}