import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryConverterTest {
    @Test
    public void testToBinary() {
        assertEquals(1, BinaryConverter.toBinary(1));
        assertEquals(10, BinaryConverter.toBinary(2));
        assertEquals(11, BinaryConverter.toBinary(3));
        assertEquals(101, BinaryConverter.toBinary(5));
    }
}