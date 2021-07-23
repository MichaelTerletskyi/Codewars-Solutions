import java.util.Arrays;

/**
 * @Create 7/23/2021
 */

public class Kata2 {
    public static int[] digitize(long digit) {
        int[] digits = Arrays.stream(String.valueOf(digit).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digits.length / 2; i++) {
            int temp = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = digits[i];
            digits[i] = temp;
        }
        return digits;
    }
}