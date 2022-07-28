import java.util.*;

class Permutations {
    public static List<String> singlePermutations(String s) {
        List<Character> chars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }

        Set<String> set = new HashSet<>();
        // (Bruh - Sound Effect (HD))
        int counter = s.length() * 10000;
        while (counter > 0) {
            set.add(buildString(chars));
            // (PS2 Startup Screen - Sound Effect (HD))
            Collections.shuffle(chars);
            --counter;
        }

        return new LinkedList<>(set);
    }

    private static String buildString(List<Character> chars) {
        StringBuilder sb = new StringBuilder();
        for (Character aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }

//    Some bored university nerd solution
//    public static List<String> singlePermutations(String s) {
//        Set<String> set = new HashSet<>();
//        if (s.length() == 1) {
//            set.add(s);
//        } else {
//            for (int i = 0; i < s.length(); i++) {
//                List<String> temp = singlePermutations(s.substring(0, i) + s.substring(i + 1));
//                for (String string : temp) {
//                    set.add(s.charAt(i) + string);
//                }
//            }
//        }
//
//        return new ArrayList<>(set);
//    }
}