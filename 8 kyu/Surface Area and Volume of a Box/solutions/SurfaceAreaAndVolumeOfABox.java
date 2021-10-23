public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w, int h, int d) {
        return new int[]{2 * (w * h + h * d + w * d), w * h * d};
    }
}