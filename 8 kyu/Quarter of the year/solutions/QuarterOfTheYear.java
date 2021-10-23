public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        return (int) Math.ceil((double) month / 3);
    }
}