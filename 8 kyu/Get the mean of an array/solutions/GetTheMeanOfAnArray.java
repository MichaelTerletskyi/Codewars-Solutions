import java.util.*;

public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }
}