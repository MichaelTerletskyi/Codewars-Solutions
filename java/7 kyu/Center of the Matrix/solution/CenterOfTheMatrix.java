public class CenterOfTheMatrix {
    public static Integer center(int[][] arr) {
        return arr.length % 2 == 0 || arr[0].length % 2 == 0 ? null : arr[arr.length / 2][arr[arr.length / 2].length / 2];
    }
}