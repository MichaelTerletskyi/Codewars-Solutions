import java.util.stream.*;

public class StringDrillsRepeater {
    public static String repeat(String s, long n) {

        //My Solution
        return IntStream.range(0, (int) n).mapToObj(x -> s).collect(Collectors.joining());

//        Best Solution
//        return s.repeat((int) n);
    }
}