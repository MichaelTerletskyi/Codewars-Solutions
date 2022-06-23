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
        fillArray(arr, index, sumDigits);
        long possibleNumbers = 1L;

        long min = getNumber(arr);
        System.out.println(String.format("%d : ++%d", getNumber(arr), possibleNumbers));
        index = 0;
        while (true) {
            ++possibleNumbers;

            index = lookingForIndex(arr, index);
            if (index + 1 < arr.length) {
                if (arr[index] + 1 <= arr[index + 1] - 1) {
                    arr[index] = ++arr[index];
                    arr[index + 1] = --arr[index + 1];

                    System.out.println(String.format("%d : ++%d", getNumber(arr), possibleNumbers));
                } else {
                    incArray(index, arr, sumDigits);
                    System.out.println(String.format("%d : ++%d", getNumber(arr), possibleNumbers));
                }
            } else {
                incArray(index, arr, sumDigits);
                System.out.println(String.format("%d : ++%d", getNumber(arr), possibleNumbers));
                break;
            }
        }
        long max = getNumber(arr);
        return List.of(possibleNumbers, min, max);
    }

    private static int lookingForIndex(long[] arr, int index) {
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
            ++index;
        }
        return index;
    }

    private static int incArray(int index, long[] arr, int sumDigits) {
        int tempIndex = index;
        index = arr.length - 1;
        if (arr[arr.length - 1 - index] + 1 < 9) {
            long temp = arr[arr.length - 1 - index];
            Arrays.fill(arr, temp + 1);
            sumDigits -= LongStream.of(arr).sum();
            for (int i = arr.length - 1; i > 0; i--) {
                long j = arr[i];
                long diff = Math.min(arr[i] + sumDigits, 9);
                if (diff - j == 0) {
                    continue;
                }
                arr[i] = diff;
                sumDigits -= (diff - j);
            }
        }
        index = tempIndex;
        return index;
    }

    private static int fillArray(long[] arr, int index, final int sumDigits) {
        int arrMinSum = arr.length;
        while (arrMinSum != sumDigits) {
            if (arr[index] < 9) {
                arr[index] = ++arr[index];
                ++arrMinSum;
            } else {
                --index;
            }
        }
        return index;
    }

    public static int getNumber(long[] arr) {
        int number = 0;
        int offset = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            number += arr[i] * offset;
            offset *= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(findAll(10, 3)); //8 :: 118, 127, 136, 145, 226, 235, 244, 334
        System.out.println("\n");
//        System.out.println(findAll(27, 3)); // 1, 999, 999
//        System.out.println(findAll(84, 4)); // []
        System.out.println(findAll(35, 6)); // 23 :: 116999, 566666
        System.out.println("\n");


    }
}