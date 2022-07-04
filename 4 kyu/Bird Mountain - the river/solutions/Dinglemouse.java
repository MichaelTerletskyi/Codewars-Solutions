import scala.Int;

import java.util.*;

public class Dinglemouse {
    private static final char MOUNTAIN = '^';
    private static final char EMPTY = ' ';
    private static final char WATER = '-';

    public static int[] dryGround(char[][] terrain) {
        preFillingAlongContours(terrain);
        List<Integer> days = new ArrayList<>();
        days.add(mountainCount(terrain));
        int changesCounter = 0;
        while (true) {
            int temp = changesCounter;
            changesCounter = flood(terrain, changesCounter);
            if (temp == changesCounter) {
                break;
            }
        }
        days.add(mountainCount(terrain));

        int target = 1;
        while (days.size() < 4) {
            System.out.println(toString(terrain));
            levelUp(terrain, target);
            ++target;
            days.add(mountainCount(terrain));
        }

        System.out.println(toString(terrain));
        return days.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void preFillingAlongContours(char[][] terrain) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == MOUNTAIN) {
                    if (i == 0 || i == terrain.length - 1 || j == 0 || j == terrain[i].length - 2) {
                        terrain[i][j] = '1';
                    }
                    if (i > 0 && (terrain[i - 1][j] == WATER || terrain[i - 1][j] == EMPTY)) {
                        terrain[i][j] = '1';
                    }
                    if (i < terrain.length - 1 && (terrain[i + 1][j] == WATER || terrain[i + 1][j] == EMPTY)) {
                        terrain[i][j] = '1';
                    }
                    if (j > 0 && (terrain[i][j - 1] == WATER || terrain[i][j - 1] == EMPTY)) {
                        terrain[i][j] = '1';
                    }
                    if (j < terrain[i].length - 1 && (terrain[i][j + 1] == WATER || (terrain[i][j + 1] == EMPTY))) {
                        terrain[i][j] = '1';
                    }
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
                    if (terrain[i][j] == MOUNTAIN) {
                        if (terrain[i - 1][j] == Character.forDigit(value - 1, 10)) {
                            indexes.add(new Integer[]{i, j});
                        }
                        if (terrain[i][j - 1] == Character.forDigit(value - 1, 10)) {
                            indexes.add(new Integer[]{i, j});
                        }
                        if (terrain[i + 1][j] == Character.forDigit(value - 1, 10)) {
                            indexes.add(new Integer[]{i, j});
                        }
                        if (terrain[i][j + 1] == Character.forDigit(value - 1, 10)) {
                            indexes.add(new Integer[]{i, j});
                        }
                    }
                }
            }
        }
        indexes.forEach(index -> terrain[index[0]][index[1]] = Character.forDigit(value, 10));
        return Math.abs(changesCounter - indexes.size());
    }

    private static void levelUp(char[][] terrain, int target) {
        Set<Integer[]> indexes = new HashSet<>();
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                char ch = Character.forDigit(target, 10);
                if (terrain[i][j] == ch) {
                    if (i > 0 && i < terrain.length - 1 && j > 0 && j < terrain[i].length - 1) {
                        if (terrain[i - 1][j] == WATER || terrain[i + 1][j] == WATER || terrain[i][j - 1] == WATER || terrain[i][j + 1] == WATER) {
                            indexes.add(new Integer[]{i, j});
                            if (terrain[i - 1][j] == EMPTY) {
                                terrain[i - 1][j] = WATER;
                            }
                            if (terrain[i + 1][j] == EMPTY) {
                                terrain[i + 1][j] = WATER;
                            }
                            if (terrain[i][j - 1] == EMPTY) {
                                terrain[i][j - 1] = WATER;
                            }
                            if (terrain[i][j + 1] == EMPTY) {
                                terrain[i][j + 1] = WATER;
                            }
                        }
                    } else {
                        indexes.add(new Integer[]{i, j});
                    }

                    indexes.add(new Integer[]{i, j});
                }
            }
        }

        indexes.forEach(index -> terrain[index[0]][index[1]] = WATER);
    }

    private static int flood(char[][] terrain, int changesCounter) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == EMPTY) {
                    if (i > 0 && terrain[i - 1][j] == WATER) {
                        terrain[i][j] = WATER;
                        ++changesCounter;
                    }
                    if (i < terrain.length - 1 && terrain[i + 1][j] == WATER) {
                        terrain[i][j] = WATER;
                        ++changesCounter;
                    }
                    if (j > 0 && terrain[i][j - 1] == WATER) {
                        terrain[i][j] = WATER;
                        ++changesCounter;
                    }
                    if (j < terrain[i].length - 1 && terrain[i][j + 1] == WATER) {
                        terrain[i][j] = WATER;
                        ++changesCounter;
                    }
                }
            }
        }
        return changesCounter;
    }

    public static void main(String[] args) {
        char[][] terrainOne = {
                "  ^^^^^^             ".toCharArray(),
                "^^^^^^^^       ^^^   ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "---------------------".toCharArray(),
                "^^^^^                ".toCharArray(),
                "   ^^^^^^^^  ^^^^^^^ ".toCharArray(),
                "^^^^^^^^     ^     ^ ".toCharArray(),
                "^^^^^        ^^^^^^^ ".toCharArray()
        };
        int[] one = dryGround(terrainOne);
        System.out.println(Arrays.toString(one)); // [189, 99, 19, 3]


        char[][] wall = {
                "------------------------- ".toCharArray(),
                "                          ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray(),
                "       ^^^^^        ^^^^^ ".toCharArray(),
                "       ^^^^^        ^^^^^ ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^ ".toCharArray()
        };
        int[] two = dryGround(wall);
        //            96
        System.out.println(Arrays.toString(two)); // [235, 144, 60, 12]

    }


    private static String toString(char[][] terrain) {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : terrain) {
            for (char ch : chars) {
                sb.append(ch);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static int mountainCount(char[][] terrain) {
        int cellsCounter = 0;
        int waterCellsCounter = 0;
        for (char[] line : terrain) {
            for (char cell : line) {
                ++cellsCounter;
                if (cell == WATER) {
                    ++waterCellsCounter;
                }
            }
        }
        return Math.abs(cellsCounter - waterCellsCounter);
    }
}