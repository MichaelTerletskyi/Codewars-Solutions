public class StairsClimb {
    public static long stairsIn20(int[][] stairs) {
        return java.util.Arrays.stream(stairs).flatMapToInt(java.util.Arrays::stream).sum() * 20;
    }
}