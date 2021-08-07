import java.util.*;

public class CalculateAverage {

    // My Solution
    public static double find_average(int[] arr) {
        return arr.length == 0 ? 0D : Arrays.stream(arr).average().getAsDouble();
    }

//    Best Solution
//    public static double find_average(int[] array){
//        return Arrays.stream(array).average().orElse(0);
//    }
}