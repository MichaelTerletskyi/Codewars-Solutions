public class ReplaceAllVowel {
    public static String replace(final String s) {

        // My Solution
        return s.replaceAll("[aeiouAEIOU]", "!");

//        Best Solution
//        return s.replaceAll("(?i)[aeiou]", "!");
    }
}