public class Movie {
    public static int movie(int card, int ticket, double perc) {
        int index = 0;
        double a = 0;
        double b = card;
        while (a <= Math.ceil(b)) {
            ++index;
            a += ticket;
            b += ticket * Math.pow(perc, index);
        }
        return index;
    }
}