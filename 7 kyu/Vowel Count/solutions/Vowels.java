public class Vowels {
    public static int getCount(final String s) {

        // My solution (work only in loweCase)
        return s.replaceAll("[^aeiou]", "").length();

//        Best Solution
//        return s.replaceAll("(?i)[^aeiou]", "").length();
    }
}