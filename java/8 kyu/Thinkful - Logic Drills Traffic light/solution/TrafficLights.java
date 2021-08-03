public class TrafficLights {
    public static String updateLight(String color) {
        return color.equals("green") ? "yellow" : color.equals("yellow") ? "red" : "green";
    }
}