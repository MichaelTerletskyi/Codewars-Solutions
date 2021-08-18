public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (!java.util.Objects.isNull(haystack[i]) && haystack[i].equals("needle")) position = i;
        }
        return String.format("found the needle at position %s", position);
    }
}