public class FindTheIntegral {
    public static String integrate(int coff, int exsp) {
        return coff / ++exsp + "x^" + exsp;
    }
}