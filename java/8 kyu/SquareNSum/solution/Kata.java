import java.util.Arrays;

/**
 * @Create 7/17/2021
 */

public class Kata {

    // Best solution in my opinion, like a Pro. Just using streams
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(digit -> digit = (int) Math.pow(digit, 2)).sum();
    }


    // Another one by 'for' cycle
    public static int squareSumSecondSolution(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
        }
        return Arrays.stream(n).sum();
    }

    // The most simple solution by using 'foreach' cycle
    public static int squareSumThirdSolution(int[] n) {
        int sum = 0;
        for (int value : n) {
            sum += (value * value);
        }
        return sum;
    }
}