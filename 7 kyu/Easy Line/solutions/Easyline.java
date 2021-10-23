import java.math.BigInteger;

public class Easyline {

    // My Solution
    public static BigInteger easyLine(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(n).add(BigInteger.valueOf(i))).divide(BigInteger.valueOf(i));
        return res;
    }

//    Some Interesting solution
//    public static BigInteger easyLine(int n) {
//        return prodRange(n + 1, 2 * n).divide(prodRange(1, n));
//    }
//
//    private static BigInteger prodRange(int from, int to) {
//        return IntStream.rangeClosed(from, to).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
//    }
}