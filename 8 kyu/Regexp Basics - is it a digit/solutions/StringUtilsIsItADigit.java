public class StringUtilsIsItADigit {

    // My solution
    public static boolean isDigit(String s) {
        return s.length() == 1 && s.replaceAll("[^0-9]", "").length() == s.length();
    }

//    Best Solution
//    public static boolean isDigit(String s) {
//        return s.matches("\\d");
//    }
}