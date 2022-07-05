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
        if (terrain == null || terrain.length == 0) {
            Arrays.fill(days, 0);
            return days;
        }

        System.out.println(":: DAY 0 ::");
        System.out.println(toString(terrain));
        System.out.println("\n");

        days[0] = groundLeft(terrain);
        if (days[0] == terrain.length * terrain[0].length) {
            Arrays.fill(days, days[0]);
            return days;
        }

        flood(terrain);
        days[1] = groundLeft(terrain);

        for (int i = 2; i < 4; i++) {
            System.out.println(String.format(":: DAY %d ::", i - 1));
            System.out.println(toString(terrain));
            System.out.println("\n");
            waterLevelUp(terrain, i - 1);
            flood(terrain);
            days[i] = groundLeft(terrain);
        }


        System.out.println(":: DAY 3 ::");
        System.out.println(toString(terrain));


        return days;
    }

    private static void waterLevelUp(char[][] terrain, int value) {
        int changeCounter = 0;
        int temp = changeCounter;
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == WATER) {
                    try {
                        if (i > 0 && terrain[i - 1][j] == Character.forDigit(value, 10)) {
                            terrain[i - 1][j] = WATER;
                            ++changeCounter;
                        }
                        if (i < terrain.length - 1 && terrain[i + 1][j] == Character.forDigit(value, 10)) {
                            terrain[i + 1][j] = WATER;
                            ++changeCounter;
                        }
                        if (j > 0 && terrain[i][j - 1] == Character.forDigit(value, 10)) {
                            terrain[i][j - 1] = WATER;
                            ++changeCounter;
                        }
                        if (j < terrain[i].length && terrain[i][j + 1] == Character.forDigit(value, 10)) {
                            terrain[i][j + 1] = WATER;
                            ++changeCounter;
                        }
                    } catch (Exception e) {

                    }
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
                if (terrain[i][j] == MOUNTAIN) {
                    if (i == 0 || i == terrain.length - 1 || j == 0 || j == terrain[i].length - 1) {
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

    private static void flood(char[][] terrain) {
        int counter = 0;
        int temp = counter;
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == EMPTY) {
                    if (i > 0 && terrain[i - 1][j] == WATER) {
                        terrain[i][j] = WATER;
                        ++counter;
                    }
                    if (i < terrain.length - 1 && terrain[i + 1][j] == WATER) {
                        terrain[i][j] = WATER;
                        ++counter;
                    }
                    if (j > 0 && terrain[i][j - 1] == WATER) {
                        terrain[i][j] = WATER;
                        ++counter;
                    }
                    if (j < terrain[i].length - 1 && terrain[i][j + 1] == WATER) {
                        terrain[i][j] = WATER;
                        ++counter;
                    }
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
        System.out.println(Arrays.toString(dryGround(terrainOne))); // [189, 99, 19, 3]
        System.out.println("\n");
        System.out.println("\n");


        char[][] wall = {
                "-------------------------".toCharArray(),
                "                         ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray(),
                "       ^^^^^        ^^^^^".toCharArray(),
                "       ^^^^^        ^^^^^".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(wall))); // [235, 144, 60, 12]
        System.out.println("\n");
        System.out.println("\n");


        char[][] flashFlood = {
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "----------------------------".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^ ^^^^^^^^ ^^^^^^^^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^ ^^  ^  ^  ^  ^  ^^ ^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(flashFlood)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] random = {
                "           ^^^^^    ".toCharArray(),
                "--------------------".toCharArray(),
                " ^^^^    ^^^^^  ^^^^".toCharArray(),
                " ^^^^^   ^^^^   ^^^^".toCharArray(),
                "         ^^^^^  ^^^^".toCharArray(),
                "               ^^^^^".toCharArray(),
                "^^^^^^^^^^     ^^^^ ".toCharArray(),
                "^^^^^^^^^   ^^^^^^^^".toCharArray(),
                "^^^^^^^^^^  ^^^^    ".toCharArray(),
                " ^^^^^^^^^^^^^^^^   ".toCharArray(),
                "  ^^^^^  ^^^^^      ".toCharArray(),
        };
        System.out.println(Arrays.toString(dryGround(random)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] twinPeaks = {
                "^^^^^       ".toCharArray(),
                "^^^^^       ".toCharArray(),
                "^^^^^       ".toCharArray(),
                "------------".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray(),
                "     ^^^^^^^".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(twinPeaks)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] lake = {
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "------------------^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(lake)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] dryMountain = {
                "^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^".toCharArray(),
        };
        System.out.println(Arrays.toString(dryGround(dryMountain)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] levee = {
                "^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "--------------------".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(levee)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] swamp = {
                "----------".toCharArray(),
                "----------".toCharArray(),
                "----------".toCharArray(),
                "----------".toCharArray(),
                "----------".toCharArray(),
                "----------".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(swamp)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] volcano = {
                "---------------------".toCharArray(),
                "      ^^^^^^^^^      ".toCharArray(),
                "    ^^^^^^^^^^^^^    ".toCharArray(),
                "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
                " ^^^^^^^     ^^^^^^^ ".toCharArray(),
                "^^^^^^^       ^^^^^^^".toCharArray(),
                "^^^^^^^       ^^^^^^^".toCharArray(),
                "^^^^^^^       ^^^^^^^".toCharArray(),
                " ^^^^^^^     ^^^^^^^ ".toCharArray(),
                "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
                "    ^^^^^^^^^^^^^    ".toCharArray(),
                "      ^^^^^^^^^      ".toCharArray()
        };
        System.out.println(Arrays.toString(dryGround(volcano)));
        System.out.println("\n");
        System.out.println("\n");


        char[][] islandsInTheStream = {
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "----------------------------".toCharArray(),
                "---     ---   ---   ^ ------".toCharArray(),
                "----------------------------".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
        };
        System.out.println(Arrays.toString(dryGround(islandsInTheStream)));
        System.out.println("\n");
        System.out.println("\n");
    }
}