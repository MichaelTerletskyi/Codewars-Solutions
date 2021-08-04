public class CompareWithinMargin {
    public static int closeCompare(double a, double b) {
        if (a == b) return 0;
        return a < b ? -1 : 1;
    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) > margin ? closeCompare(a, b) : 0;
    }
}