public class ColouredTriangles {
    public static char getChar(char c1, char c2) {
        return c1 == c2 ? c1 : java.util.Arrays.stream(new Character[]{'R', 'B', 'G'}).filter(c -> !c.equals(c1) && !c.equals(c2)).findFirst().orElse('㋛');
    }

    public static char triangle(String s) {
        while (s.length() > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length()) sb.append(getChar(s.charAt(i), s.charAt(i + 1)));
                else s = sb.toString();
            }
        }
        return s.charAt(0);
    }
}