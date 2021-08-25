public class Evaporator {
    public static int evaporator(double c, double e, double t) {
        return (int) Math.ceil((Math.log(t / 100D)) / (Math.log(1D - (e / 100))));
    }
}