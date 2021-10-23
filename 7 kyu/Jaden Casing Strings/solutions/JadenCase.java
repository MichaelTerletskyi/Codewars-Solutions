import java.util.*;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        return Objects.isNull(phrase) || phrase.isEmpty() ? null :
                Arrays.stream(phrase.split(" ")).map(e -> e = make(e)).collect(Collectors.joining(" "));
    }

    public String make(String s) {
        return String.format("%s%s", Character.toUpperCase(s.charAt(0)), s.substring(1));
    }
}