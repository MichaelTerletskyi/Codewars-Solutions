public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        java.util.Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i - 1 >= 0) sum += arr[i] - arr[i - 1];
        }
        return arr.length <= 1 ? 0 : sum;
    }

//    Best Solution
//    public static int sumOfDifferences(int[] arr) {
//        java.util.Arrays.sort(arr);
//        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
//    }
}