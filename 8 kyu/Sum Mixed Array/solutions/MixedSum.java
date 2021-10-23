import java.util.List;

public class MixedSum {

    // My Solution
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            if (o.getClass().equals(String.class)) {
                sum += Integer.parseInt((String) o);
            } else {
                sum += (Integer) o;
            }
        }
        return sum;
    }

    // Using Streams
//    public int sum(List<?> mixed) {
//        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
//    }
}