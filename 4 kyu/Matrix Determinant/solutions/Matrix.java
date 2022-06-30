public class Matrix {
    public static int determinant(int[][] matrix) {
        return recursiveSearch(matrix, matrix.length);
    }

    private static void getMatrixCoFactor(int[][] matrix, int[][] temp, int index, int n) {
        int j = 0; int k = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != 0 && col != index) {
                    temp[j][k++] = matrix[row][col];
                    if (k == n - 1) {
                        k = 0;
                        j++;
                    }
                }
            }
        }
    }

    private static int recursiveSearch(int[][] matrix, int n) {
        if (n == 1) return matrix[0][0];
        int[][] temp = new int[n][n];
        int prefix = 1;
        int determinant = 0;
        for (int index = 0; index < n; index++) {
            getMatrixCoFactor(matrix, temp, index, n);
            determinant += prefix * matrix[0][index] * recursiveSearch(temp, n - 1);
            prefix = -prefix;
        }
        return determinant;
    }
}