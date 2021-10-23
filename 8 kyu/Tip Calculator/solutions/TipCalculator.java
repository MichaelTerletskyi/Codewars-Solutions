public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("terrible", 0);
        map.put("poor", 5);
        map.put("good", 10);
        map.put("great", 15);
        map.put("excellent", 20);
        return map.containsKey(rating.toLowerCase()) ? (int) Math.ceil(amount / 100 * map.get(rating.toLowerCase())) : null;
    }
}