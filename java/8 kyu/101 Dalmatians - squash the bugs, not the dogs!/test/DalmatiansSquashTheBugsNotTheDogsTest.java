import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DalmatiansSquashTheBugsNotTheDogsTest {

    @Test
    public void basicTests() {
        assertEquals("More than a handful!", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(26));
        assertEquals("Hardly any", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(8));
        assertEquals("More than a handful!", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!", DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(101));
    }
}