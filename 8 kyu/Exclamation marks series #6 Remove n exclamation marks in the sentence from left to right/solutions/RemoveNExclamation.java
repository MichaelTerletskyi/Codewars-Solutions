public class RemoveNExclamation {

    // My Solution
    public static String remove(String s, int n) {
        int counter = Math.min(n, s.replaceAll("[^!]", "").length());
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String e : arr) {
            if (e.equals("!")) {
                if (counter < 1) sb.append(e);
                --counter;
            } else sb.append(e);
        }
        return sb.toString();
    }

//    Best Solution
//    public static String remove(String s, int n) {
//        while (n-- > 0) s = s.replaceFirst("!", "");
//        return s;
//    }
}