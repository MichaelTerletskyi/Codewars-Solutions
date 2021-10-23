public class BasicOperations {
    public static Integer basicMath(String o, int x, int y) {
        return o.equals("+") ? x + y : o.equals("-") ? x - y : o.equals("*") ? x * y : x / y;
    }
}