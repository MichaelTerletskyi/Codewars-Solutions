import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MilerPerGallonToKilometersPerLiterConverterTest {

    @Test
    public void test1() {
        assertEquals(3.54f, MilerPerGallonToKilometersPerLiterConverter.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, MilerPerGallonToKilometersPerLiterConverter.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, MilerPerGallonToKilometersPerLiterConverter.mpgToKPM(30), 0.001f);
    }
}