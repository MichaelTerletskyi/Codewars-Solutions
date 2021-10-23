public class Greeter {
    public static String greet(String n) {
        return n.equals("Johnny") ? "Hello, my love!" : String.format("Hello, %s!", n);
    }
}