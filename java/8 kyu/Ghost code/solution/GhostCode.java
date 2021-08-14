public class GhostCode {
    public static String helloName(final String n) {
        return java.util.Objects.isNull(n) || n.isEmpty() ? "Hello world!" : String.format("Hello my name is %s", n);
    }
}