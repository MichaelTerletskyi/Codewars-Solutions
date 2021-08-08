public class DalmatiansSquashTheBugsNotTheDogs {
    public static String howManyDalmatians(int n) {
        String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};
        return n <= 10 ? dogs[0] : n <= 50 ? dogs[1] : n == 101 ? dogs[3] : dogs[2];
    }
}