import java.util.*;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Arrays.stream(firstCuboid).reduce(1, (x, y) -> x * y) - Arrays.stream(secondCuboid).reduce(1, (x, y) -> x * y);
    }
}