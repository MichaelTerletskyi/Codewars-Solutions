import java.util.*;

class Sorter {
    public static List<String> sort(List<String> textbooks) {
        java.util.Collections.sort(textbooks);

//        Best Solution
//        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}