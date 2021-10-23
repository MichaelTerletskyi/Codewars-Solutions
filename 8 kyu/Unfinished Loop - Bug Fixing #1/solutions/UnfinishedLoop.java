import java.util.stream.*;

class UnfinishedLoop {
    public static java.util.List<Integer> CreateList(int n) {
        return IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
    }
}