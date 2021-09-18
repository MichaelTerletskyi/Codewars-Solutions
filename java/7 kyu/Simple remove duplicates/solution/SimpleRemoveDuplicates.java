import java.util.*;

public class SimpleRemoveDuplicates {

    // My Solution
    public static int[] solve(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = array.length - 1; i >= 0; i--) {
            set.add(array[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

//    Best Solution
//    public static int[] solve(final int[] arr) {
//        final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        return IntStream
//                .range(0, arr.length)
//                .filter(i -> i == list.lastIndexOf(arr[i]))
//                .mapToObj(i -> arr[i])
//                .flatMapToInt(IntStream::of)
//                .toArray();
//    }
}