import java.util.Arrays;
import java.util.stream.*;

public class ReverseWords {

    // Ny Solution
    public static String reverseWords(final String original) {
        String[] arr = original.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return original.strip().length() == 0 ? original : String.join(" ", arr);
    }


//    Best Solution
//    public static String reverseWords(final String original) {
//        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)")).map(str
//                -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining());
//    }
}