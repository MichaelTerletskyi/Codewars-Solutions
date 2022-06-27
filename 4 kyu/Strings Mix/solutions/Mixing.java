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

        StringBuilder sb = new StringBuilder();
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
                            break;
                        } else {
                            arrayList.set(i, second);
                            arrayList.set(j, null);
                            break;
                        }
                    }
                }
            }
        }

        arrayList.removeAll(Collections.singleton(null));
        Collections.sort(arrayList);
        System.out.println("\n");
        return "";
    }


    private static List<String> buildStringSet(Map<Character, Integer> map, int n) {
        Set<String> set = new TreeSet<>(Comparator.naturalOrder());
        map.forEach((ch, val) -> {
            if (val > 1) {
                set.add(String.format("%s:%s:%s", ch, val, n == 1 ? "(" : ")"));
            }
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

    public static void main(String[] args) {
//        mix("Are they here", "yes, they are here"); // -> "2:eeeee/2:yy/=:hh/=:rr"
        mix("looping is fun but dangerous", "less dangerous than coding"); // -> "1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg"
        mix(" In many languages", " there's a pair of efunctions"); // -> "1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt"
        mix("Lords of the Fallen", "gamekult"); // -> "1:ee/1:ll/1:oo"
        mix("codewars", "codewars"); // -> ""
        mix("A generation must confront the looming ", "codewarrs"); // -> "1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr"
    }
}