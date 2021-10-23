public class AreaOrPerimeter {
    public static int areaOrPerimeter(int length, int width) {
        return length == width ? width * length : width * 2 + length * 2;
    }
}
