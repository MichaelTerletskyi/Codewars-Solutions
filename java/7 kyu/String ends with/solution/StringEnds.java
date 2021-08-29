public class StringEnds {

    // My Solution
    public static boolean solution(String s, String e) {
        return e.length() <= s.length() && s.substring(s.length() - e.length()).equals(e);
    }

//    Best Solution
//    public static boolean solution(String str, String ending) {
//        return str.endsWith(ending);
//    }
}