import java.util.*;
import java.util.stream.IntStream;

public class MergingSortedIntegerArrays {
    public static int[] mergeArrays(int[] f, int[] s) {
        return IntStream.concat(Arrays.stream(f), Arrays.stream(s)).distinct().sorted().toArray();
    }
}