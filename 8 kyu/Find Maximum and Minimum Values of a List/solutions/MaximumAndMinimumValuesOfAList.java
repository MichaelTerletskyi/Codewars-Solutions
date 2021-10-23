public class MaximumAndMinimumValuesOfAList {
    public int min(int[] arr) {
        return java.util.Arrays.stream(arr).min().getAsInt();
    }

    public int max(int[] arr) {
        return java.util.Arrays.stream(arr).max().getAsInt();
    }
}