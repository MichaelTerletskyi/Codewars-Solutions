public class StringTemplatesBugFixing {
    public static String buildString(String... s) {
        return String.format("I like %s!", String.join(", ", s));
    }
}