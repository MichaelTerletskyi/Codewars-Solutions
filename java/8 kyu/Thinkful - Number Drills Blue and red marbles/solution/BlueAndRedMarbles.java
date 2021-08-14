public class BlueAndRedMarbles {
    public static double guessBlue(int bS, int rS, int bP, int rP) {
        return (double) (bS - bP) / ((bS - bP) + (rS - rP));
    }
}