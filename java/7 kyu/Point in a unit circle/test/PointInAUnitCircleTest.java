import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PointInAUnitCircleTest {

    @Test
    void origin() {
        assertTrue(PointInAUnitCircle.pointInCircle(0, 0), "Origin is inside");
    }

    @Test
    void outsidePoint() {
        assertFalse(PointInAUnitCircle.pointInCircle(2, 0), "(2, 0) is outside");
    }

    @Test
    void insidePoint1() {
        assertTrue(PointInAUnitCircle.pointInCircle(0, 0.9), "(0, 0.9) is inside");
    }

    @Test
    void insidePoint2() {
        assertTrue(PointInAUnitCircle.pointInCircle(0.5, 0.5), "(0.5, 0.5) is inside");
    }
}