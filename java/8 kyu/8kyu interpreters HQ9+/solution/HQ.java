import java.util.stream.*;

public class HQ {
    public static String HQ9(char code) {
        return code == 'H' ? "Hello World!" : code == 'Q' ? String.valueOf(code) : code == '9' ? IntStream.range(-99, 0).mapToObj(i ->
                textParse(i, 'U', 0) + " of beer on the wall, " +
                textParse(i, 'L', 0) + " of beer." + '\n' + "Take one down and pass it around, " +
                textParse(i, 'L', 1) + " of beer on the wall.\n").collect(Collectors.joining()) +
                "No more bottles of beer on the wall, no more bottles of beer.\n" + "Go to the store and buy some more, 99 bottles of beer on the wall." : null;
    }

    public static String textParse(int d, char c, int i) {
        return (Math.abs(d + i) > 1 ? Math.abs(d + i) + " bottles" : Math.abs(d + i) == 1
                ? Math.abs(d + i) + " bottle" : c == 'U' ? "No" : "no" + " more bottles");
    }
}