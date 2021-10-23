import java.util.*;
import java.util.stream.*;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int[] arr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        return String.format("%s %s", IntStream.of(arr).max().getAsInt(), IntStream.of(arr).min().getAsInt());
    }
}