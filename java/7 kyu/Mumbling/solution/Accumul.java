public class Accumul {
    public static String accum(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i].repeat(i + 1);
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + temp.substring(1);
        }
        return String.join("-", arr);
    }
}