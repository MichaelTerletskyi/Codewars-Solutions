import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetWarTest {

    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
    }
}