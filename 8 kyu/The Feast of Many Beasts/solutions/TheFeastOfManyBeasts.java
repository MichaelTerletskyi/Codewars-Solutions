public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return String.valueOf(beast.charAt(0) + beast.charAt(beast.length() - 1)).equalsIgnoreCase(String.valueOf(dish.charAt(0) + dish.charAt(dish.length() - 1)));
    }
}