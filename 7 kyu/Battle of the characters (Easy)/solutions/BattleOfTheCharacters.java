import java.util.stream.IntStream;

public class BattleOfTheCharacters {

    // My Solution
    public static String battle(final String x, final String y) {
        return val(x) == val(y) ? "Tie!" : val(x) > val(y) ? x : y;
    }

    public static long val(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.toLowerCase().toCharArray()[i] - '`').mapToInt(Integer::intValue).sum();
    }

//    Best Solution
//    static String battle(String x, String y) {
//        int xs = x.chars().map(i -> i - 64).sum(), ys = y.chars().map((i -> i - 64)).sum();
//        return xs > ys ? x : xs < ys ? y : "Tie!";
//    }
}