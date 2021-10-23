import java.util.*;
import java.util.stream.IntStream;

public class GpsSpeed {

    // My Solution
    public static int gps(int s, double[] x) {
        if (Objects.isNull(x) || x.length == 0) return 0;
        Double[] arr = new Double[x.length - 1];
        for (int i = 0; i < x.length - 1; i++) {
            arr[i] = Math.floor((3600 * Math.abs(x[i] - x[i + 1])) / s);
        }
        return (int) Math.floor(Arrays.stream(arr).mapToDouble(Double::doubleValue).max().orElse(0D));
    }

//    Best Solution
//    public static int gps(int s, double[] x) {
//        return (int) Math.floor(IntStream.range(0, x.length - 1).mapToDouble(i
//                -> (x[i + 1] - x[i]) * 3600.0 / (double) s).max().orElse(0.0));
//    }
}