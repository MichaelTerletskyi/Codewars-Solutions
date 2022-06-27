import java.util.List;

public class HowManyNumbers {
    private static long possibleNumbersCounter, min, max;

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        possibleNumbersCounter = 0; min = 0; max = 0;
        search(0L, 1, sumDigits, numDigits);
        return possibleNumbersCounter > 0 ? List.of(possibleNumbersCounter, min, max) : List.of();
    }

    private static void search(Long currentNumber, int previousDigit, int sumLeft, int digitsLeft) {
        if (sumLeft == 0 && digitsLeft == 0) {
            if (possibleNumbersCounter == 0) {
                min = currentNumber;
            }
            min = min < currentNumber ? min : currentNumber;
            max = max > currentNumber ? max : currentNumber;
            ++possibleNumbersCounter;
        } else if (digitsLeft != 0) {
            for (int i = previousDigit; i < 10; i++) {
                search(10 * currentNumber + i, i, sumLeft - i, digitsLeft - 1);
            }
        }
    }

//    My shitty solution, it works, but "Execution Timed Out (16000 ms)"
//    public static List<Long> findAll(final int sumDigits, final int numDigits) {
//        if (9 * numDigits < sumDigits || sumDigits < numDigits) {
//            return List.of();
//        }
//        if (9 * numDigits == sumDigits) {
//            long val = Long.parseLong("9".repeat(numDigits));
//            return List.of(1L, val, val);
//        }
//
//        long[] arr = new long[numDigits];
//        Arrays.fill(arr, 1);
//        int index = arr.length - 1;
//        int arrMinSum = arr.length;
//        while (arrMinSum != sumDigits) {
//            if (arr[index] < 9) {
//                arr[index] = ++arr[index];
//                ++arrMinSum;
//            } else {
//                --index;
//            }
//        }
//
//        long min = getNumber(arr);
//        Arrays.fill(arr, sumDigits / numDigits);
//        long sum = sumDigits - LongStream.of(arr).sum();
//        while (sum != 0) {
//            for (int i = arr.length - 1; i > 0; i--) {
//                arr[i] = ++arr[i];
//                sum -= 1;
//                if (sum == 0) break;
//            }
//        }
//        long max = getNumber(arr);
//
//        long possibleNumbers = 0L;
//        for (long i = max; i >= min; i--) {
//            if (isValid(i, sumDigits)) {
//                ++possibleNumbers;
//            }
//        }
//
//        return List.of(possibleNumbers, min, max);
//    }
//
//    private static boolean isValid(long temp, int sumDigits) {
//        long[] array = new long[String.valueOf(temp).length()];
//        int index = array.length - 1;
//        do {
//            long val = temp % 10;
//            array[index] = val;
//            temp /= 10;
//            sumDigits -= val;
//            --index;
//        } while (temp > 0);
//        for (int i = array.length - 1; i > 0; i--) {
//            if (array[i] < array[i - 1]) {
//                return false;
//            }
//        }
//        return sumDigits == 0;
//    }
//
//    private static int getNumber(long[] arr) {
//        int number = 0;
//        int offset = 1;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            number += arr[i] * offset;
//            offset *= 10;
//        }
//        return number;
//    }
}