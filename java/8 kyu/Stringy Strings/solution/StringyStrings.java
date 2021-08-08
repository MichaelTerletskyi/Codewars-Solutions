import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringyStrings {

//  My Solution
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) sb.append(i % 2 == 0 ? 1 : 0);
        return sb.toString();
    }

//    Best Solution
//    public static String stringy(int size) {
//        return IntStream.range(0, size).mapToObj(x -> x % 2 == 0 ? "1" : "0").collect(Collectors.joining());
//    }
}