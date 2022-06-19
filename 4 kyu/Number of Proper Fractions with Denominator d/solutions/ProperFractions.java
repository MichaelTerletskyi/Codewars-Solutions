public class ProperFractions {
    public static long properFractions(long n) {
        if (n == 1) return 0;
        long result = n, x = n;
        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                result = result / i * (i - 1);
                while (x % i == 0) {
                    x /= i;
                }
            }
        }
        return x > 1 ? result / x * (x - 1) : result;
    }
}