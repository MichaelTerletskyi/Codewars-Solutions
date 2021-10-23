public class DetermineOffspringSex {
    public static String chromosomeCheck(String cum) {
        return cum.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}