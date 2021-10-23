import java.util.List;
import java.util.stream.IntStream;

public class Rotations {
    public static boolean containAllRots(String s, List<String> arr) {
        return IntStream.range(0, s.length()).filter(i -> arr.indexOf(s.substring(i) + s.substring(0, i)) == -1).count() == 0;
    }
}