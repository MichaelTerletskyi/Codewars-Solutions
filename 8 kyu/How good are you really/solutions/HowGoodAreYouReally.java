import java.util.stream.IntStream;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return java.util.Arrays.stream(classPoints).average().getAsDouble() < yourPoints;
     // return java.util.stream.IntStream.of(classPoints).average().getAsDouble() < yourPoints;
    }
}