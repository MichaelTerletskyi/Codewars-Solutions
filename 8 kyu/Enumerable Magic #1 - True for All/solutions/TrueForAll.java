import java.util.Arrays;
import java.util.function.Predicate;

public class TrueForAll {
    public static boolean all(int[] list, Predicate<Integer> p) {
        return Arrays.stream(list).filter(p::test).count() == list.length;
    }
}