import java.math.BigInteger;

public class FindTheSquares {
    public static String findSquares(int n) {
        return String.format("%s-%s", BigInteger.valueOf(n / 2 + 1).pow(2), BigInteger.valueOf(n / 2).pow(2));
    }
}