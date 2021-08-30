import java.util.*;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        return a1.length == 0 || a2.length == 0 ? -1 : Math.max(
                Arrays.stream(a1).mapToInt(String::length).max().getAsInt() - Arrays.stream(a2).mapToInt(String::length).min().getAsInt(),
                Arrays.stream(a2).mapToInt(String::length).max().getAsInt() - Arrays.stream(a1).mapToInt(String::length).min().getAsInt());
    }
}