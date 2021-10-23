public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.replaceAll("[^0-9]", ""));
    }
}