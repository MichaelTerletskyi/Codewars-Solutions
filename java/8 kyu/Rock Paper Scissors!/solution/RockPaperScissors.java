public class RockPaperScissors {
    // My Solution
    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : p1.equals("scissors") && !p2.equals("rock") ? "Player 1 won!" : p1.equals("paper") && !p2.equals("scissors")
                ? "Player 1 won!" : p1.equals("rock") && !p2.equals("paper") ? "Player 1 won!" : "Player 2 won!";
    }

//    Best Solution
//    public static String rps(String p1, String p2) {
//        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1 + p2) ? 1 : 2) + " won!";
//    }
}