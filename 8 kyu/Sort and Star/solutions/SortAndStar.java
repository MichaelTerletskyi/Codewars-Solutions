import java.util.*;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);

        // My Solution
        String result = s[0].trim().replaceAll("", "***");
        return result.substring(3, result.length() - 3);

//        Best Solution
//        return String.join("***",s[0].split(""));
    }
}