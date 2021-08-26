import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n).split("")).map(s
                -> String.valueOf((int) Math.pow(Integer.parseInt(s), 2))).collect(Collectors.joining()));
    }
}