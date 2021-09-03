public class Scale {

    // My Solution
    public static String scale(String s, int k, int v) {
        StringBuilder sb = new StringBuilder();
        for (String value : s.split("\n")) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < value.length(); j++) {
                temp.append(String.valueOf(value.charAt(j)).repeat(k));
            }
            temp.append("\n");
            sb.append(temp.toString().repeat(v));
        }
        return sb.toString().trim();
    }

//    Best Solution
//    public static String scale(String strng, int k, int v) {
//        return strng.replaceAll("(\\w)", "$1".repeat(k))
//                .replaceAll("(\\w+\\n)", "$1".repeat(v))
//                .replaceAll("(\\n\\w+$)", "$1".repeat(v));
//    }
}