import java.util.regex.Pattern;

public class Nessie {
    public static boolean isLockNessMonster(String s) {

        // My Solution
        return Pattern.compile("tree fiddy").matcher(s).find() || Pattern.compile("3.50").matcher(s).find();

//        Best Solution
//        return Pattern.matches(".*(tree fiddy|3\\.50|three fifty).*", s);
    }
}