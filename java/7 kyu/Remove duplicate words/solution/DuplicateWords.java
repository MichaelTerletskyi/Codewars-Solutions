import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static String removeDuplicateWords(String str) {
        return Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}