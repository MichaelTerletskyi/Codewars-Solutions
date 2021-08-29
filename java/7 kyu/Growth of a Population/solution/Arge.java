class Arge {

    // My Solution
    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        while (p0 < p) {
            p0 += ((double) (p0 / 100) * percent + aug);
            ++count;
        }
        return count;
    }

//    Best Solution by recursion
//    public static int nbYear(int p0, double percent, int aug, int p) {
//        return p0 >= p ? 0 : nbYear((int) (p0 + aug + p0 * (percent / 100)), percent, aug, p) + 1;
//    }
}