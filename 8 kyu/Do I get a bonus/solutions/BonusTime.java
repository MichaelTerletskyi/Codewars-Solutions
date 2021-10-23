public class BonusTime {
    public static String bonusTime(int s, boolean b) {
        return "£" + (b ? s * 10 : s);
    }
}