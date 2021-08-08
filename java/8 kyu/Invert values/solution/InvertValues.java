public class InvertValues {
    public static int[] invert(int[] array) {
        return java.util.Arrays.stream(array).map(d -> d = -d).toArray();
    }
}