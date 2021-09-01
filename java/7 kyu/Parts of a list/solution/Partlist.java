import java.util.Arrays;
import java.util.stream.*;

public class Partlist {

    // My Solution
    public static String[][] partlist(String[] arr) {
        String[][] res = new String[arr.length - 1][];
        for (int i = 0; i < res.length; i++) {
            res[i] = new String[]{
                    String.join(" ", Arrays.copyOfRange(arr, 0, i + 1)),
                    String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length))};
        }
        return res;
    }

//    Best Solution
//    public static String[][] partlist(String[] arr) {
//        return (String[][]) IntStream.range(1, arr.length)
//                .mapToObj(i -> new String[]{
//                        Arrays.stream(arr, 0, i).collect(Collectors.joining(" ")),
//                        Arrays.stream(arr, i, arr.length).collect(Collectors.joining(" "))})
//                .toArray(String[][]::new);
//    }
}