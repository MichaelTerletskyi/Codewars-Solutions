public class Printer {
    public static String printerError(String s) {
        return String.format("%d/%d", s.replaceAll("(?i)[^n-z]", "").length(), s.length());
    }
}