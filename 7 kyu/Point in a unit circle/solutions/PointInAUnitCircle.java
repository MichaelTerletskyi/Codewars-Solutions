public class PointInAUnitCircle {
    public static boolean pointInCircle(double x, double y) {

        // My Solution
        return Math.pow(x, 2) + Math.pow(y, 2) <= 1;
//
//        Best Solution
//        return Math.hypot(x,y) <= 1;
    }
}