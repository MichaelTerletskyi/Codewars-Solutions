public class LastSurvivor {
    public static String lastSurvivor(String s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            s = arr[i] == 0 ? s.substring(1) : s.substring(0, arr[i]) + s.substring(arr[i] + 1);
        }
        return s;
    }
}