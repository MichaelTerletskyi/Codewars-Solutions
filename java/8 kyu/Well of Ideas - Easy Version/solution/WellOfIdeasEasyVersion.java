import java.util.Arrays;

public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        long count = Arrays.stream(x).filter(s -> s.equals("good")).count();
        if (count > 2) return "I smell a series!";
        return count == 0 ? "Fail!" : "Publish!";
    }
}