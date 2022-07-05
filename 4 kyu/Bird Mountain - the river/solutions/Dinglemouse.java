import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dinglemouse {
    private static final char MOUNTAIN = '^';
    private static final char EMPTY = ' ';
    private static final char WATER = '-';

    public static int[] dryGround(char[][] terrain) {
        preFillingAlongContours(terrain);
        int[] days = new int[4];
        if (terrain.length == 0) {
            Arrays.fill(days, 0);
            return days;
        }

        days[0] = groundLeft(terrain);
        if (days[0] == terrain.length * terrain[0].length) {
            Arrays.fill(days, days[0]);
            return days;
        }

        flood(terrain);
        for (int i = 1; i < 4; i++) {
            waterLevelUp(terrain, i - 1);
            days[i] = groundLeft(terrain);
        }

        return days;
    }

    private static void waterLevelUp(char[][] terrain, int value) {
        int changeCounter = 0;
        int temp = changeCounter;
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == WATER) {
                    try {
                        char ch = Character.forDigit(value, 10);
                        if (i > 0 && terrain[i - 1][j] == ch) {
                            terrain[i - 1][j] = WATER;
                            ++changeCounter;
                        }
                        if (i < terrain.length - 1 && terrain[i + 1][j] == ch) {
                            terrain[i + 1][j] = WATER;
                            ++changeCounter;
                        }
                        if (j > 0 && terrain[i][j - 1] == ch) {
                            terrain[i][j - 1] = WATER;
                            ++changeCounter;
                        }
                        if (j < terrain[i].length && terrain[i][j + 1] == ch) {
                            terrain[i][j + 1] = WATER;
                            ++changeCounter;
                        }
                    } catch (Exception e) {}
                }
                if (Character.isDigit(terrain[i][j]) && Character.getNumericValue(terrain[i][j]) <= value) {
                    try {
                        if ((i > 0 && terrain[i - 1][j] == WATER) || (i < terrain.length - 1 && terrain[i + 1][j] == WATER) ||
                                (j > 0 && terrain[i][j - 1] == WATER) || (j < terrain[i].length && terrain[i][j + 1] == WATER)) {
                            terrain[i][j] = WATER;
                            ++changeCounter;
                        }
                    } catch (Exception e) {}
                }
            }
        }
        flood(terrain);
        if (temp == changeCounter) {
            return;
        }
        waterLevelUp(terrain, value);
    }

    private static void preFillingAlongContours(char[][] terrain) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == MOUNTAIN &&
                        (i == 0 || i == terrain.length - 1 || j == 0 || j == terrain[i].length - 1 || terrain[i - 1][j] == WATER || terrain[i - 1][j] == EMPTY ||
                                i < terrain.length - 1 && (terrain[i + 1][j] == WATER || terrain[i + 1][j] == EMPTY) || terrain[i][j - 1] == WATER ||
                                terrain[i][j - 1] == EMPTY || j < terrain[i].length - 1 && (terrain[i][j + 1] == WATER || terrain[i][j + 1] == EMPTY))) {
                    terrain[i][j] = '1';
                }
            }
        }
        int changesCounter = 0;
        int value = 2;
        while (true) {
            int temp = changesCounter;
            changesCounter = digitalizeTerrain(terrain, value, changesCounter);
            if (temp == changesCounter) {
                break;
            }
            ++value;
        }
    }

    private static int digitalizeTerrain(char[][] terrain, int value, int changesCounter) {
        Set<Integer[]> indexes = new HashSet<>();
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (i > 0 && j > 0 && i < terrain.length - 1 && j < terrain[i].length - 1) {
                    if (terrain[i][j] == MOUNTAIN && ((terrain[i - 1][j] == Character.forDigit(value - 1, 10)) ||
                            (terrain[i][j - 1] == Character.forDigit(value - 1, 10)) ||
                            (terrain[i + 1][j] == Character.forDigit(value - 1, 10)) ||
                            (terrain[i][j + 1] == Character.forDigit(value - 1, 10)))) {
                        indexes.add(new Integer[]{i, j});
                    }
                }
            }
        }
        indexes.forEach(index -> terrain[index[0]][index[1]] = Character.forDigit(value, 10));
        return Math.abs(changesCounter - indexes.size());
    }

    private static void flood(char[][] terrain) {
        int counter = 0;
        int temp = counter;
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == EMPTY && ((i > 0 && terrain[i - 1][j] == WATER) || (i < terrain.length - 1 && terrain[i + 1][j] == WATER) ||
                        (j > 0 && terrain[i][j - 1] == WATER || (j < terrain[i].length - 1 && terrain[i][j + 1] == WATER)))) {
                    terrain[i][j] = WATER;
                    ++counter;
                }
            }
        }
        if (counter == temp) {
            return;
        }
        flood(terrain);
    }

    private static int groundLeft(char[][] terrain) {
        int ground = terrain.length * terrain[0].length;
        int waterCellsCounter = 0;
        for (char[] line : terrain) {
            for (char cell : line) {
                if (cell == WATER) ++waterCellsCounter;
            }
        }
        return ground - waterCellsCounter;
    }
}