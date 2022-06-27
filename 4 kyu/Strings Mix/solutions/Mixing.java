import java.util.*;

public class Mixing {
    public static String mix(String s1, String s2) {
        if (s1.equals(s2)) return "";
        List<String> listOne = buildStringSet(extractChars(s1), 1);
        List<String> listTwo = buildStringSet(extractChars(s2), 2);

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < listOne.size() + listTwo.size(); i++) {
            if (i < listOne.size()) {
                String[] arr = listOne.get(i).split(":");
                arrayList.add(arr[2] + ":" + arr[0].repeat(Integer.parseInt(arr[1])));
            } else {
                String[] arr2 = listTwo.get(i - listOne.size()).split(":");
                arrayList.add(arr2[2] + ":" + arr2[0].repeat(Integer.parseInt(arr2[1])));
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String first = arrayList.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                if (i != j) {
                    String second = arrayList.get(j);
                    if (first != null && second != null && first.charAt(first.length() - 1) == second.charAt(second.length() - 1)) {
                        if (first.length() == second.length()) {
                            arrayList.set(j, null);
                            arrayList.set(i, "=" + first.substring(1));
                            break;
                        }
                        if (first.length() > second.length()) {
                            arrayList.set(j, null);
                        } else {
                            arrayList.set(i, second);
                            arrayList.set(j, null);
                        }
                    }
                }
            }
        }
        arrayList.removeAll(Collections.singleton(null));
        Collections.sort(arrayList);
        arrayList.sort((o1, o2) -> o2.length() - o1.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i + 1 < arrayList.size()) sb.append("/");
        }
        return sb.toString();
    }


    private static List<String> buildStringSet(Map<Character, Integer> map, int n) {
        Set<String> set = new TreeSet<>(Comparator.naturalOrder());
        map.forEach((ch, val) -> {
            if (val > 1) set.add(String.format("%s:%s:%s", ch, val, n == 1 ? "1" : "2"));
        });
        return new ArrayList<>(set);
    }

    private static Map<Character, Integer> extractChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    int temp = map.get(ch);
                    map.put(ch, ++temp);
                }
            }
        }
        return map;
    }
}