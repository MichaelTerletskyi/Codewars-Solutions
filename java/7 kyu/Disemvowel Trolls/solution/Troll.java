public class Troll {
    public static String disemvowel(String s) {
        return s.replaceAll("(?i)[aeiou]", "");
    }
}