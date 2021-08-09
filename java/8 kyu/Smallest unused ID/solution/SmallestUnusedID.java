import java.util.*;
import java.util.stream.IntStream;

public class SmallestUnusedID {

    // My Solution
    public static int nextId(int[] ids) {
        if (ids.length == 0) return 0;
        java.util.Arrays.sort(ids);
        Set<Integer> set = new LinkedHashSet<>();
        for (int id : ids) set.add(id);
        int counter = (int) set.toArray()[0];
        if (counter > 0) return 0;
        for (int i = 0; i < set.size(); i++) {
            if (counter != (int) set.toArray()[i]) return counter;
            ++counter;
        }
        return (int) set.toArray()[set.size() - 1] + 1;
    }

//    Best Solution
//    public static int nextId(int[] ids) {
//        return IntStream.range(0, ids.length + 1).filter(id -> !IntStream.of(ids).anyMatch(x -> x == id)).findFirst().getAsInt();
//    }
}