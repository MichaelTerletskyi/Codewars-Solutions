public class NoBoring {
    // My Solution
    public static int noBoringZeros(int n) {
        String[] arr = String.valueOf(n).split("");
        int c = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("0")) ++c;
            else break;
        }
        int d = 1;
        if (c > 0) {
            for (int i = 0; i < c; i++) d *= 10;
        }
        return c > 0 ? n / d : n;
    }

//    Best Solution
//    public static int noBoringZeros(int n) {
//        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n / 10);
//    }
}