import static java.util.stream.LongStream.rangeClosed;

public class PowerOfTwo {

    // My Solution
    public static long[] powersOfTwo(int n) {
        long digit = 1;
        long[] ints = new long[n + 1];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = digit;
            digit = digit * 2;
        }
        return ints;
    }

//    Best Solution
//    public static long[] powersOfTwo(int n) {
//        return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
//    }
}