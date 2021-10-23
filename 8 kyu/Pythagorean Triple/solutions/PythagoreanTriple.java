public class PythagoreanTriple {
    public int pythagoreanTriple(int... arr) {
        return Math.pow(arr[2], 2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) ? 1 : 0;
    }
}