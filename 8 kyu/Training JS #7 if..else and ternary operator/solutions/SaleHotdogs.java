public class SaleHotdogs {
    public static int saleHotdogs(int n) {
        return n < 5 ? n * 100 : n < 10 ? n * 95 : n * 90;
    }
}