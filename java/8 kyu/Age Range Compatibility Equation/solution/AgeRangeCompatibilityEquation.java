public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return String.format("%s-%s", age <= 14 ? (int) (age - 0.10 * age) : age / 2 + 7, age <= 14 ? (int) (age + 0.10 * age) : (age - 7) * 2);
    }
}
