public class FuelCalculator {
    public static double fuelPrice(int l, double p) {
//        My Solution
        return l * (p - (l < 2 ? 0D : l <= 10 ? (double) (l / 2) * 5 : 25) / 100D);

//        Best Solution
//        return l * (p - Math.min(l / 2 * 0.05, 0.25));
    }
}