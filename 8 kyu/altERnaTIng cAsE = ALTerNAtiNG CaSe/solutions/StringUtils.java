public class StringUtils {

    // Mo Solution
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        java.util.Arrays.stream(string.split("")).forEach(e -> sb.append((int) e.charAt(0) >= 65 && (int) e.charAt(0) <= 90
                ? Character.toLowerCase(e.charAt(0)) : (int) e.charAt(0) >= 97 && (int) e.charAt(0) <= 122
                ? Character.toUpperCase(e.charAt(0)) : e.charAt(0)));
        return sb.toString();
    }

//    Best Solution
//    public static String toAlternativeString(String string) {
//        return java.util.Arrays.stream(string.split(""))
//                .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
//                .collect(java.util.stream.Collectors.joining(""));
//    }
}