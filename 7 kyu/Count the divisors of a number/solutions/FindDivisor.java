public class FindDivisor {
    public long numberOfDivisors(int n) {
        return java.util.stream.IntStream.range(1, n + 1).filter(d -> n % d == 0).count();
    }
}