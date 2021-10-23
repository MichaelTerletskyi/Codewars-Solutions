public class NumberFun {
    public static long findNextSquare(long n) {
        return Math.sqrt(n) % 1 == 0 ? (long) (Math.pow(((int) (Math.sqrt(n)) + 1), 2)) : -1L;
    }
}