public class Switch {
    public static String switcheroo(String x) {
        return x.replace("a", "@")
                .replace("b", "a")
                .replace("@", "b");
    }
}