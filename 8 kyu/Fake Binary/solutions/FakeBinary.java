public class FakeBinary {

    // My solution
    public static String fakeBin(String numberString) {
        String[] arr = numberString.split("");
        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            if (Integer.parseInt(s) >= 5) res.append("1");
            else res.append("0");
        }
        return res.toString();
    }

    // Best Solution at my opinion
//    public static String fakeBin(String numberString) {
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
//    }
}