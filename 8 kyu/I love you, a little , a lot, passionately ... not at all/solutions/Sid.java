public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        return nb_petals % 6 == 0 ? "not at all" : new String[]{"I love you", "a little", "a lot", "passionately", "madly"}[(nb_petals % 6) - 1];
    }
}