public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return java.util.Arrays.stream(numbers).filter(d -> d % divider == 0).toArray();
    }
}