public class Ghost {
    public Ghost() {}

    public String getColor() {
        String[] arr = {"white", "yellow", "purple", "red"};
        return arr[(int) (Math.random() * arr.length)];
    }
}