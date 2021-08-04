class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 11; i++) {
            String temp = String.format("%s * %s = %s", i, num, (i * num));
            if (i != 10) sb.append(temp).append('\n');
            else sb.append(temp);
        }
        return sb.toString();
    }
}