import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ZywOo {

    // My Solution
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) list.add(array[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

//    Best Solution
//    public static int[] multipleOfIndex(int[] a) {
//        return IntStream.range(1, a.length).filter(i -> a[i] % i == 0).map(i -> a[i]).toArray();
//    }
}