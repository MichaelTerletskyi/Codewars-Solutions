public class AllStarCodeChallenge {
    public static int strCount(String s, char letter) {
        return s.length() - s.replaceAll(String.valueOf(letter), "").length();
    }
}