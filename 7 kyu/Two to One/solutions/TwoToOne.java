import java.util.Arrays;
import java.util.stream.*;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        return Arrays.stream((s1 + s2).split("")).sorted().distinct().collect(Collectors.joining());
    }
}