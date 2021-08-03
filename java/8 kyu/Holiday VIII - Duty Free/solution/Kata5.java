public class Kata5 {

    // Mo solution
    public static int dutyFree(int normPrice, int discount, int hol) {
        double sum = 0;
        int count = 0;
        double finalPrice = normPrice - ((double) normPrice / 100 * (100 - discount));
        while (sum + finalPrice <= hol) {
            ++count;
            sum += finalPrice;
        }
        return count;
    }

    // Best solution
//    public static int dutyFree(int normPrice, int discount, int hol) {
//        return hol * 100 / (normPrice * discount);
//    }
}