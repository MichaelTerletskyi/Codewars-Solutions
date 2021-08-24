public class Slope {
    public String slope(int... p) {
        return p[2] - p[0] == 0 ? "undefined" : String.valueOf((p[3] - p[1]) / (p[2] - p[0]));
    }
}