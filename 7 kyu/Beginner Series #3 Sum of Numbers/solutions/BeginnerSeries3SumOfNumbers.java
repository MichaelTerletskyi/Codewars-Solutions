public class BeginnerSeries3SumOfNumbers {
    public int GetSum(int a, int b) {
        return a == b ? a : java.util.stream.IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
}