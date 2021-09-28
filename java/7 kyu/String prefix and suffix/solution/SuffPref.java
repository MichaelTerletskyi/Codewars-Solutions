class SuffPref {

    // My Solution
    public static int solve(String s) {
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.substring(0, i + 1).equals(s.substring(s.length() - i - 1)))
                count = s.substring(0, i + 1).length();
        }
        return count;
    }
}

//TOP Solution
//import static java.util.stream.IntStream.iterate;
//
//interface SuffPref {
//    static int solve(String s) {
//        return iterate(s.length() / 2, i -> i > 0, i -> i - 1)
//                .filter(i -> s.substring(0, i).equals(s.substring(s.length() - i)))
//                .findFirst()
//                .orElse(0);
//    }
//}