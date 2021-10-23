import java.util.stream.*;

public class RepeatIt {
    public static String repeatString(Object toRepeat, int n) {
        return toRepeat instanceof String ? IntStream.range(0, n).mapToObj(i -> "" + toRepeat).collect(Collectors.joining()) : "Not a string";
    }
}