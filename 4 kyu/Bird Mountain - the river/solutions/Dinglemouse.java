import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Dinglemouse {
    private static final char MOUNTAIN = '^';
    private static final char EMPTY = ' ';
    private static final char WATER = '-';

    public static int[] dryGround(char[][] terrain) {
        List<Integer> days = new ArrayList<>();
        int[] start = cellCount(terrain);
        int landCounter = start[0] - start[1];
        days.add(landCounter);

        System.out.println(toString(terrain));

        while (true) {
            int temp = landCounter;
            landCounter = flood(terrain, landCounter);
            if (temp == landCounter) {
                break;
            }
        }

        days.add(landCounter);

        while (true) {
            if (days.size() == 4) break;
            int temp = landCounter;
            System.out.println(toString(terrain));
            landCounter = waterLevelUp(terrain, landCounter);
            days.add(landCounter);
        }
        System.out.println(toString(terrain));
        return days.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int waterLevelUp(char[][] terrain, int landCounter) {
        Set<Integer[]> waterIndexes = new HashSet<>();
        for (int i = 0; i < terrain.length; i++) {
            if (i == 0) {
                boolean lineContainsWater = false;
                Set<Integer[]> setTemnp = new HashSet<>();
                for (int k = 0; k < terrain.length; k++) {
                    if (terrain[0][k] == MOUNTAIN) {
                        setTemnp.add(new Integer[]{0, k});
                    }
                    if (terrain[0][k] == WATER) {
                        lineContainsWater = true;
                    }
                }
                if (lineContainsWater) {
                    waterIndexes.addAll(setTemnp);
                }
            }

            for (int j = 0; j < terrain[i].length; j++) {

                if (terrain[i][j] == MOUNTAIN) {
                    if (i > 0 && terrain[i - 1][j] == WATER) {
                        waterIndexes.add(new Integer[]{i, j});
                    }
                    if (i < terrain.length - 1 && terrain[i + 1][j] == WATER) {
                        waterIndexes.add(new Integer[]{i, j});
                    }
                    if (j > 0 && terrain[i][j - 1] == WATER) {
                        waterIndexes.add(new Integer[]{i, j});
                    }
                    if (i < terrain[i].length - 1 && terrain[i][j + 1] == WATER) {
                        waterIndexes.add(new Integer[]{i, j});
                    }
                }
            }
        }

        AtomicInteger temp = new AtomicInteger(landCounter);
        waterIndexes.forEach(index -> {
            terrain[index[0]][index[1]] = WATER;
            temp.decrementAndGet();
        });

        landCounter = temp.get();
        return flood(terrain, landCounter);
    }

    private static int flood(char[][] terrain, int landCounter) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == WATER) {
                    if (i > 0 && terrain[i - 1][j] == EMPTY) {
                        terrain[i - 1][j] = WATER;
                        --landCounter;
                    }
                    if (i < terrain.length - 1 && terrain[i + 1][j] == EMPTY) {
                        terrain[i + 1][j] = WATER;
                        --landCounter;
                    }
                    if (j > 0 && terrain[i][j - 1] == EMPTY) {
                        terrain[i][j - 1] = WATER;
                        --landCounter;
                    }
                    if (j < terrain[i].length - 1 && terrain[i][j + 1] == EMPTY) {
                        terrain[i][j + 1] = WATER;
                        --landCounter;
                    }
                }
            }
        }
        return landCounter;
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

    private static int[] cellCount(char[][] terrain) {
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
        return new int[]{cellsCounter, waterCellsCounter};
    }
}