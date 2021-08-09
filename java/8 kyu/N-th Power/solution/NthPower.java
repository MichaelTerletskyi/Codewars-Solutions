public class NthPower {
    public static int nthPower(int[] array, int n) {
        return array.length - 1 < n ? -1 : (int) Math.pow(array[n], n);
    }
}