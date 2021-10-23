import java.util.*;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(n -> n % 2 != 0).collect(java.util.stream.Collectors.toList());
    }
}