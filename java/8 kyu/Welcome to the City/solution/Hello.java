import java.util.Arrays;
import java.util.stream.*;

public class Hello {
    public String sayHello(String[] name, String city, String state) {
     // My Solution
        return String.format("Hello,%s! Welcome to %s, %s!", Arrays.stream(name).map(s -> " " + s).collect(Collectors.joining()), city, state);

     // Best Solution
     // return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}