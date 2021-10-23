public class AlphabetWar {
    // My Solution
    public static String alphabetWar(String f) {
        int l = (count(f, 'w') * 4 + count(f, 'p') * 3 + count(f, 'b') * 2 + count(f, 's'));
        int r = (count(f, 'm') * 4 + count(f, 'q') * 3 + count(f, 'd') * 2 + count(f, 'z'));
        return l == r ? "Let's fight again!" : (l > r ? "Left side wins!" : "Right side wins!");
    }

    public static int count(String s, char ch) {
        return s.replaceAll("[^" + ch + "]", "").length();
    }

//    Best solution
//    public static String alphabetWar(String s) {
//        String r = "wpbs_zdqm";
//        int result = s.chars().reduce(0, (a, b) -> a + (r.indexOf(b) == -1 ? 0 : r.indexOf(b) - 4));
//        return result == 0 ? "Let's fight again!" : (result < 0 ? "Left" : "Right") + " side wins!";
//    }
}