public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return String.format("%S.%S", name.split(" ")[0].charAt(0), name.split(" ")[1].charAt(0));
    }
}