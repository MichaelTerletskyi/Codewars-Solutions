import java.util.stream.*;

public class TripleTrouble {

    // My solution
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.length(); i++)
            sb.append(String.format("%s%s%s", one.charAt(i), two.charAt(i), three.charAt(i)));
        return sb.toString();
    }

//    Best Solution
//    public static String tripleTrouble(String a, String b, String c) {
//        return IntStream.range(0, a.length()).mapToObj(i -> "" + a.charAt(i) + b.charAt(i) + c.charAt(i)).collect(Collectors.joining());
//    }
}