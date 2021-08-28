class DivSeven {
    public static long[] seven(long m) {
        for (int i = 0; i < m; i++) {
            long diff = (m - ((m / 10) * 10)) * 2;
            long temp = (m / 10) - diff;
            if ((int) (Math.log10(temp) + 1) <= 2) return new long[]{temp, i + 1};
            else m = temp;
        }
        return new long[]{m, 0};
    }
}