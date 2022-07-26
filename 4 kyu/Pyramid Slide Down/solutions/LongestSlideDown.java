public class LongestSlideDown {
    // Algo-genius solution
    public static int longestSlideDown(int[][] pyramid) {
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = pyramid[i][j] + Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return pyramid[0][0];
    }

//    My Solution, it works but Timeout 16000ms
//    public static int longestSlideDown(int[][] pyramid) {
//        if (pyramid.length == 1) return pyramid[0][0];
//        List<List<Integer>> integers = new ArrayList<>(List.of(List.of(pyramid[0][0])));
//        AtomicInteger max = new AtomicInteger(pyramid[0][0]);
//        for (int i = 1; i < pyramid.length; i++) {
//            List<List<Integer>> temp = new ArrayList<>();
//            for (int j = 0; j < pyramid[i].length; j++) {
//                int val = pyramid[i][j];
//                if (j == 0) {
//                    Integer first = integers.get(j).get(0);
//                    temp.add(List.of(val + first));
//                    if (i == pyramid.length - 1) {
//                        setNewMaximum(max, val + first);
//                    }
//                    continue;
//                }
//                if (j == pyramid[i].length - 1) {
//                    List<Integer> list = integers.get(integers.size() - 1);
//                    Integer last = list.get(list.size() - 1);
//                    temp.add(List.of(val + last));
//                    if (i == pyramid.length - 1) {
//                        setNewMaximum(max, val + last);
//                    }
//                    continue;
//                }
//                List<Integer> list = new ArrayList<>();
//                integers.get(j - 1).forEach(d -> list.add(setNewMaximum(max, val + d)));
//                integers.get(j).forEach(d -> list.add(setNewMaximum(max, val + d)));
//                temp.add(list);
//            }
//            integers = temp;
//        }
//        return max.get();
//    }
//
//    private static int setNewMaximum(AtomicInteger atomicInteger, int value) {
//        if(value > atomicInteger.get()) {
//            atomicInteger.set(value);
//        }
//        return value;
//    }
}