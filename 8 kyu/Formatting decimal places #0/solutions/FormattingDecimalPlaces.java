public class FormattingDecimalPlaces {
    public static double TwoDecimalPlaces(double number) {
        // My Solution
        return Double.parseDouble(new java.text.DecimalFormat("#.##").format(number));

//        Best Solution
//        return Math.round(number * 100D) / 100D;
    }
}