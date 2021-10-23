class Composing {

    // My Solution
    public static String compose(String s1, String s2) {
        String[] res = new String[s1.split("\n").length];
        for (int i = 0; i < res.length; i++) {
            res[i] = s1.split("\n")[i].substring(0, i + 1) +
                    s2.split("\n")[res.length - i - 1].substring(0, res.length - i);
        }
        return String.join("\n", res);
    }

//    Interesting Solution by Stream API
//    public static String compose(String s1, String s2) {
//        String[] s1s = s1.split("\n");
//        String[] s2s = s2.split("\n");
//        return java.util.stream.IntStream.range(0, s1s[0].length())
//                .mapToObj(i ->
//                        s1s[i].substring(0, i + 1) +
//                        s2s[s1s[0].length() - i - 1].substring(0, s1s[0].length() - i))
//                .reduce((a, b) -> (a + "\n" + b))
//                .orElse("");
//    }
}