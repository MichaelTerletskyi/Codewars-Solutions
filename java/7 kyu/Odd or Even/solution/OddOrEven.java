public class OddOrEven {
    public static String oddOrEven(int[] arr) {
        return java.util.stream.IntStream.of(arr).sum() % 2 == 0 ? "even" : "odd";
    }
}