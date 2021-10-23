import java.math.BigInteger;

public class Funcij {
    public static BigInteger sumin(int n) {
        return BigInteger.valueOf(n)
                .multiply((BigInteger.valueOf(n).add(BigInteger.ONE))
                .multiply((BigInteger.TWO.multiply(BigInteger.valueOf(n)).add(BigInteger.ONE))))
                .divide(BigInteger.valueOf(6L));
    }

    public static BigInteger sumax(int n) {
        return BigInteger.valueOf(n)
                .multiply(BigInteger.valueOf(n))
                .multiply(BigInteger.valueOf(n))
                .subtract(sumin(n - 1));
    }

    public static BigInteger sumsum(int n) {
        return BigInteger.valueOf(n)
                .pow(2)
                .add(BigInteger.valueOf(n))
                .multiply(BigInteger.valueOf(n));
    }
}