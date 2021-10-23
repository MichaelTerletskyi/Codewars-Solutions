import java.util.Arrays;
import java.util.stream.IntStream;

public class EnumerableMagic25TakeTheFirstNElements {

    // My Solution
    public static int[] take(int[] arr, int n) {
        return IntStream.range(0, arr.length).filter(index -> index < n).map(index -> arr[index]).toArray();
    }

//    Best Solution
//    public static int[] take(int[] arr, int n) {
//        return n > arr.length ? arr : Arrays.copyOf(arr, n);
//    }
}