public class Bob {
    public static int enough(int cap, int on, int wait) {
        return on + wait <= cap ? 0 : Math.abs(cap - (on + wait));
    }
}