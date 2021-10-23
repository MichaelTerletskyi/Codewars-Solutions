public class SimpleValidationOfAUsernameWithRegex {
    public static boolean validateUsr(String s) {

        // My Solution
        return s.length() >= 4 && s.length() <= 16 && java.util.Arrays.stream(s.split(""))
                .noneMatch(e -> Character.isUpperCase(e.toCharArray()[0]) || e.equals(" "));

//        Best Solution
//        return s.matches("[a-z_\\d]{4,16}");
    }
}