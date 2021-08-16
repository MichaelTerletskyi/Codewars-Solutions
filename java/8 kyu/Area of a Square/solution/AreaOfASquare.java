public class AreaOfASquare {
    public static double squareArea(double a) {
        return Double.parseDouble(new java.text.DecimalFormat("#.##").format(Math.pow(2 * a / Math.PI, 2)));
    }
}