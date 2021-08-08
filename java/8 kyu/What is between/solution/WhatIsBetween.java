public class WhatIsBetween {
    public static int[] between(int x, int z) {
        return java.util.stream.IntStream.range(x, z + 1).toArray();
    }
}