import java.util.Collections;
import java.util.stream.IntStream;

public class ReversedSequence {

    // My Solution
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(1, n).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

//        Best Solution
//        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}