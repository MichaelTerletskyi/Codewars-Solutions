public class BeadsCounter {
    public static int countRedBeads(int nBlue) {
        return nBlue < 2 ? 0 : (nBlue - 1) * 2;
    }
}