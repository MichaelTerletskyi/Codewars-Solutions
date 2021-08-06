public class CalculateBMI {
    public static String bmi(double weight, double height) {
        final double BMI = weight / Math.pow(height, 2);
        return BMI <= 18.5D ? "Underweight" : BMI <= 25.0D ? "Normal" : BMI <= 30 ? "Overweight" : "Obese";
    }
}