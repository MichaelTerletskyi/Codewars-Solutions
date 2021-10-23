public class KataExampleTwist {

    // My Solution
    public static String[] kataExampleTwist() {
        return java.util.Arrays.stream(new String[1000]).map(e -> e = "codewars").toArray(String[]::new);
    }

//    Best Solution
//    public static String[] kataExampleTwist() {
//        String[] websites = new String[1000];
//        java.util.Arrays.fill(websites,"codewars");
//        return websites;
//    }
}