public class Matrix {
    public static int determinant(int[][] matrix) {
        if (matrix.length == 1) return Math.abs(matrix[0][0]);
        if (matrix.length == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int determinant = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int floor = 0;
            int frontIndex = i;
            int backIndex = i;
            int positive = matrix[0][i];
            int negative = matrix[0][i];
            for (int j = 1; j < n; j++) {
                ++floor;
                frontIndex = frontIndex + 1 < n ? ++frontIndex : 0;
                backIndex = backIndex - 1 >= 0 ? --backIndex : n - 1;
                positive *= matrix[floor][frontIndex];
                negative *= matrix[floor][backIndex];
            }
            determinant += positive;
            determinant -= negative;
        }
        return determinant;
    }

    public static void main(String[] args) {
        int[][][] matrix = {
                {{1}},
                {{1, 3}, {2, 5}},
                {{2, 5, 3}, {1, -2, -1}, {1, 3, 4}},
                {{1, -1, 0, 0}, {2, 3, 1, -1}, {3, -2, 0, 1}, {-2, 2, 1, -3}},
                {{1, 2, 3, 4}, {5, 0, 2, 8}, {3, 5, 6, 7}, {2, 5, 3, 1}}
        };
        int[] expected = {1, -1, -20, -3, 24};

        for (int n = 0; n < expected.length; n++) {
            int x = expected[n];
            int determinant = Matrix.determinant(matrix[n]);
            System.out.println(String.format("Expected = %d, determinant = %d, %s", x, determinant, expected[n] == Matrix.determinant(matrix[n])));
        }
    }
}