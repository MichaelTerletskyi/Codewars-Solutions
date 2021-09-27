public class WithoutLetterE {
    public static String findE(String str) {
        if (str == null) return null;
        int length = str.replaceAll("(?i)[^e]", "").length();
        return str.isEmpty() ? "" : length > 0 ? String.valueOf(length) : "There is no \"e\".";
    }
}