public class ArrayPrinter {
    public static String printArray(Object[] arr) {

        // My Solution
        return String.join(",", java.util.Arrays.stream(arr).map(Object::toString).toArray(String[]::new));

//        Best Solution
//        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}