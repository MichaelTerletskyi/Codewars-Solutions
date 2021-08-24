import org.junit.Test;

import static org.junit.Assert.*;

public class LeonardoDicaprioAndOscarsTest {

    @Test
    public void oscar88() {
        assertEquals("Leo finally won the oscar! Leo is happy", LeonardoDicaprioAndOscars.leo(88));
    }

    @Test
    public void oscar86() {
        assertEquals("Not even for Wolf of wallstreet?!", LeonardoDicaprioAndOscars.leo(86));
    }

    @Test
    public void below88() {
        assertEquals("When will you give Leo an Oscar?", LeonardoDicaprioAndOscars.leo(87));
        assertEquals("When will you give Leo an Oscar?", LeonardoDicaprioAndOscars.leo(83));
        assertEquals("When will you give Leo an Oscar?", LeonardoDicaprioAndOscars.leo(85));
    }

    @Test
    public void over88() {
        assertEquals("Leo got one already!", LeonardoDicaprioAndOscars.leo(89));
        assertEquals("Leo got one already!", LeonardoDicaprioAndOscars.leo(90));
        assertEquals("Leo got one already!", LeonardoDicaprioAndOscars.leo(95));
    }
}