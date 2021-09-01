public class RobinsonCrusoe {
    public static double[] crusoe(int n, double d, double ang, double distmult, double angmult) {
        double[] arr = {0, 0};
        for (ang = Math.toRadians(ang); n > 0; n--, d *= distmult, ang *= angmult) {
            arr[0] = arr[0] + d * Math.cos(ang);
            arr[1] = arr[1] + d * Math.sin(ang);
        }
        return arr;
    }
}