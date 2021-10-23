public class Fibonacci {

    // My Solution by loop base
    public static long fib(int n) {
        long x = 0;
        long y = 1;
        long fib = 0L;
        for (int i = 1; i < n; i++) {
            fib = x + y;
            x = y;
            y = fib;
        }
        return n == 1 ? 1L : fib;
    }

//    My solution by recursion but it's works, but doesn't pass by Execution Timed Out (16000 ms)
//    public static long fib(int n) {
//        return n < 2 ? n : fib(n - 1) + fib(n - 2);
//    }

//    Best Solution
//    public static long fib(int n) {
//        return java.util.stream.Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[0] + i[1]})
//                .limit(n).reduce((x, y) -> y).orElseThrow()[0];
//    }
}