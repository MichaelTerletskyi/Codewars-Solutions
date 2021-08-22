public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        return (int) java.util.Arrays.stream(nums).average().orElse(0);
    }
}