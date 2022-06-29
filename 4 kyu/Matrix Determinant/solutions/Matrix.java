import java.util.stream.IntStream;

public class Matrix {
    // https://ua.onlinemschool.com/math/assistance/matrix/determinant/?oms_all=a%3d%7b%7b2,5,3%7d,%7b1,-2,-1%7d,%7b1,3,4%7d%7d
    // https://www.cuemath.com/algebra/determinant-of-matrix/

    //| 2  5  3 |
    //| 1 -2 -1 |
    //| 1  3  4 |
    public static int determinant(int[][] matrix) {
        if (matrix.length == 1) return Math.abs(matrix[0][0]);
        int determinant = 0;
        for (int i = 0; i < matrix.length * 2; i++) {
            if (i > matrix.length - 1) {
                int vTarget = 0;
                int hTarget = matrix.length  - i;
                int value = matrix[vTarget][hTarget];
                for (int j = 0; j < matrix[i].length; j++) {
                    if (vTarget + 1 < matrix[i].length) {
                        ++vTarget;
                    }
                    if (hTarget - 1 >= 0) {
                        --hTarget;
                    } else {
                        hTarget += matrix[i].length - 1;
                    }
                }
                determinant -= value;
            } else {
                int vTarget = 0;
                int hTarget = i;
                int value = matrix[vTarget][hTarget];
                for (int j = 1; j < matrix[i].length; j++) {
                    if (vTarget + 1 < matrix[i].length) {
                        ++vTarget;
                    }
                    if (hTarget + 1 < matrix[i].length) {
                        ++hTarget;
                    } else {
                        hTarget -= matrix[i].length - 1;
                    }
                    value *= matrix[vTarget][hTarget];
                }
                determinant += value;
            }
        }
        return determinant;
    }

    public static void main(String[] args) {
        int[][][] matrix = {
                {{1}},


                // det A = |1  3| = 1·5 - 2·3 = 5 + 6 = -1
                //         |2  5|
                {{1, 3}, {2, 5}},


                // det A = | 2  5  3 | =  2·(-2)·4  +  5·(-1)·1  +  3·1·3  -  3·(-2)·1  -  2·(-1)·3  -  5·1·4  = -16 - 5 + 9 + 6 + 6 - 20 = -20
                //         | 1 -2 -1 |
                //         | 1	3  4 |
                // _________________________________________________________________________________
                // | 2       |   |    5    |   |       3 |   |       3 |   | 2       |   |    5    |
                // |   -2    | + |      -1 | + | 1       | - |   -2    | - |      -1 | - | 1       |
                // |       4 |   | 1       |   |    3    |   | 1       |   |  	3    |   |       4 |
                // ---------------------------------------------------------------------------------
                //    -16            -5             9             6             6             20
                {{2, 5, 3}, {1, -2, -1}, {1, 3, 4}},

                {{1, -1, 0, 0}, {2, 3, 1, -1}, {3, -2, 0, 1}, {-2, 2, 1 - 3}}

        };
        int[] expected = {1, -1, -20, -3};

        for (int n = 0; n < expected.length; n++) {
            int x = expected[n];
            int determinant = Matrix.determinant(matrix[n]);
            System.out.println(String.format("Expected = %d, determinant = %d, %s", x, determinant, expected[n] == Matrix.determinant(matrix[n])));
        }
    }
}