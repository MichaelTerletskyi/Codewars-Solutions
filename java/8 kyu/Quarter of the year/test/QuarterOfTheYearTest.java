import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuarterOfTheYearTest {

    @Test
    public void exampleTests() {
        Assertions.assertEquals(1, QuarterOfTheYear.quarterOf(3));
        Assertions.assertEquals(3, QuarterOfTheYear.quarterOf(8));
        Assertions.assertEquals(4, QuarterOfTheYear.quarterOf(11));
    }
}