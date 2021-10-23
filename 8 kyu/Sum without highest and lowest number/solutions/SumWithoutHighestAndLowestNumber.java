import java.util.stream.*;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] n) {
        return n == null ? 0 : n.length <= 1 ? 0 : IntStream.of(n).sum() - (IntStream.of(n).max().orElse(0) + IntStream.of(n).min().orElse(0));
    }
}