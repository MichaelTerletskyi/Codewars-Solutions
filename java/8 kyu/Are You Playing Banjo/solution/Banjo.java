public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return String.format("%s %s", name, name.toLowerCase().charAt(0) == 'r' ? "plays banjo" : "does not play banjo");
    }
}