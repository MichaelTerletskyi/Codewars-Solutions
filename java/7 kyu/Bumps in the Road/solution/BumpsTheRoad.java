public class BumpsTheRoad {
    public static String bumps(String road) {
        return road.replaceAll("[^n]", "").length() > 15 ? "Car Dead" : "Woohoo!";
    }
}