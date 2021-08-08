import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetNthEvenNumberTest {

    @Test
    public void exampleTests() {
        assertEquals(0, GetNthEvenNumber.nthEven(1));
        assertEquals(2, GetNthEvenNumber.nthEven(2));
        assertEquals(4, GetNthEvenNumber.nthEven(3));
        assertEquals(198, GetNthEvenNumber.nthEven(100));
        assertEquals(2597466, GetNthEvenNumber.nthEven(1298734));
    }
}