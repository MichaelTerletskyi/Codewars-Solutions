import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeOfACuboidTest {
    private static final double delta = 0.0001;

    @Test
    public void examples() {
        assertEquals(4, VolumeOfACuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfACuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}