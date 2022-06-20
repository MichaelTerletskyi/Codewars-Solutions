public class SumOfSquares {
    public static int nSquaresFor(int n) {
        if (Math.sqrt(n) % 1 == 0) {
            return 1;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i < n; ++i) {
            int a = n - i * i;
            if (Math.sqrt(a) % 1 == 0) {
                return 2;
            }
        }
        return 3;
    }
}