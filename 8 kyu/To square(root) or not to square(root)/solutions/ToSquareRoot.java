public class ToSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        return java.util.stream.IntStream.of(array).map(x -> (int) (Math.sqrt(x) == (int) Math.sqrt(x) ? Math.sqrt(x) : Math.pow(x, 2))).toArray();
    }
}