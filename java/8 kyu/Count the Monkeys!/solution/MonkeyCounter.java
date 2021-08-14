public class MonkeyCounter {
    public static int[] monkeyCount(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).toArray();
    }
}