public class InParts {

    // My Solution
    public static String splitInParts(String s, int l) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && i % l == 0) sb.append(" ");
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

//    Best Solution
//    public static String splitInParts(String s, int l) {
//        return s.replaceAll("(.{" + l + "})(?!$)", "$1 ");
//    }
}