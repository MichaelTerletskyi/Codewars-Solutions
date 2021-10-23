public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                if (dir == 'R') {
                    if (arr[j] > arr[j + 1]) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                if (dir == 'L') {
                    if (arr[j] < arr[j + 1]) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }
}