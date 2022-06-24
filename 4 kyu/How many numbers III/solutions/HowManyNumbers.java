import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class HowManyNumbers {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        if (9 * numDigits < sumDigits || sumDigits < numDigits) {
            return List.of();
        }
        if (9 * numDigits == sumDigits) {
            long val = Long.parseLong("9".repeat(numDigits));
            return List.of(1L, val, val);
        }

        long[] arr = new long[numDigits];
        Arrays.fill(arr, 1);
        int index = arr.length - 1;
        int arrMinSum = arr.length;
        while (arrMinSum != sumDigits) {
            if (arr[index] < 9) {
                arr[index] = ++arr[index];
                ++arrMinSum;
            } else {
                --index;
            }
        }

        long min = getNumber(arr);
        Arrays.fill(arr, sumDigits / numDigits);
        long sum = sumDigits - LongStream.of(arr).sum();
        while (sum != 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = ++arr[i];
                sum -= 1;
                if (sum == 0) break;
            }
        }
        long max = getNumber(arr);

        long possibleNumbers = 0L;
        for (long i = max; i >= min; i--) {
            if (isValid(i, sumDigits)) {
                ++possibleNumbers;
            }
        }

        return List.of(possibleNumbers, min, max);
    }

    private static boolean isValid(long temp, int sumDigits) {
        long[] array = new long[String.valueOf(temp).length()];
        int index = array.length - 1;
        do {
            long val = temp % 10;
            array[index] = val;
            temp /= 10;
            sumDigits -= val;
            --index;
        } while (temp > 0);
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return sumDigits == 0;
    }

    private static int getNumber(long[] arr) {
        int number = 0;
        int offset = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            number += arr[i] * offset;
            offset *= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(findAll(10, 3)); // 8 :: 118, 127, 136, 145, 226, 235, 244, 334
        System.out.println("\n");
        System.out.println(findAll(27, 3)); // 1:: 999, 999
        System.out.println("\n");
        System.out.println(findAll(84, 4)); // []
        System.out.println("\n");
        System.out.println(findAll(35, 6)); // 123L :: 116999, 566666
        System.out.println("\n");
    }
}