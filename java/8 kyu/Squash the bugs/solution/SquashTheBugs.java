import java.util.Arrays;

public class SquashTheBugs {
    public static int findLongest(final String str) {
        return Arrays.stream(str.split(" ")).mapToInt(String::length).max().getAsInt();
    }
}