public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return java.util.Arrays.stream(arr1).sum() + java.util.Arrays.stream(arr2).sum();
    }
}