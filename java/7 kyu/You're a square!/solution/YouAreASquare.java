public class YouAreASquare {
    public static boolean isSquare(int n) {
        // My Solution
        return (int) (Math.sqrt(n)) * (int) (Math.sqrt(n)) == n;

//        Best Solution
//        return Math.sqrt(n) % 1 == 0;
    }
}