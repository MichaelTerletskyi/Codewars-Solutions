public class GrassHopperDebug {
    public static String weatherInfo(int temp) {
        double result = convertToCelsius(temp);
        return String.format("%s %s", result + "", result < 0 ? "is freezing temperature" : "is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return ((temperature - 32) * 5) / 9.0;
    }
}