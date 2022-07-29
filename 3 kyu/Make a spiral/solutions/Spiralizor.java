public class Spiralizor {
    private static final int ONE = 1;
    private static final int ZERO = 0;

    public static int[][] spiralize(int size) {
        int[][] array = new int[size][size];
        Vector currentVector = Vector.RIGHT;
        int i = 0; int j = 0;
        while (true) {
            if (canSetValue(array, i, j)) {
                array[i][j] = ONE;
            } else {
                break;
            }

            if (currentVector == Vector.RIGHT && (j == array[i].length - 1 || (j <= array[i].length - 3 && array[i][j + 1] == ZERO && array[i][j + 2] == ONE))) {
                currentVector = Vector.DOWN;
            }
            if (currentVector == Vector.DOWN && (i == array.length - 1 || (i <= array.length - 3 && array[i + 1][j] == ZERO && array[i + 2][j] == ONE))) {
                currentVector = Vector.LEFT;
            }
            if (currentVector == Vector.LEFT && (j == 0 || (j >= 2 && array[i][j - 1] == ZERO && array[i][j - 2] == ONE))) {
                currentVector = Vector.UP;
            }
            if (currentVector == Vector.UP && (i == 0 || (i >= 2 && array[i - 1][j] == ZERO && array[i - 2][j] == ONE))) {
                currentVector = Vector.RIGHT;
            }

            if (currentVector == Vector.RIGHT) ++j;
            if (currentVector == Vector.LEFT) --j;
            if (currentVector == Vector.UP) --i;
            if (currentVector == Vector.DOWN) ++i;
        }
        return array;
    }

    private static boolean canSetValue(int[][] array, int i, int j) {
        int conter = 0;
        try {
            if (array[i][j + 1] == ONE) ++conter;
            if (array[i][j - 1] == ONE) ++conter;
            if (array[i + 1][j] == ONE) ++conter;
            if (array[i - 1][j] == ONE) ++conter;
        } catch (RuntimeException e) {
            // wet fart (sound effect)
        }
        return conter < 2;
    }

    private enum Vector {
        LEFT, RIGHT, UP, DOWN
    }
}