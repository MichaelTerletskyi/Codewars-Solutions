import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        List<String> allPossiblePins = new ArrayList<>();
        StringBuilder builder = new StringBuilder(observed);
        HashMap<String, String[]> numpad = new HashMap<>();
        numpad.put("1", new String[]{"1", "2", "4"});
        numpad.put("2", new String[]{"1", "2", "3", "5"});
        numpad.put("3", new String[]{"2", "3", "6"});
        numpad.put("4", new String[]{"1", "4", "5", "7"});
        numpad.put("5", new String[]{"2", "4", "5", "6", "8"});
        numpad.put("6", new String[]{"3", "5", "6", "9"});
        numpad.put("7", new String[]{"4", "7", "8"});
        numpad.put("8", new String[]{"5", "7", "8", "9", "0"});
        numpad.put("9", new String[]{"6", "8", "9"});
        numpad.put("0", new String[]{"0", "8"});

        char[] obsPin = observed.toCharArray();
        String[] firstPosValues = numpad.get(String.valueOf(obsPin[0]));

        for (String value : firstPosValues) {
            builder.setCharAt(0, value.charAt(0));
            int currentNum = 1;
            int[] currentPerm = new int[obsPin.length];

            if (obsPin.length > 1) {
                while (currentNum != obsPin.length && currentNum > 0) {
                    String[] values = numpad.get(String.valueOf(obsPin[currentNum]));
                    if (currentNum == obsPin.length - 1) {
                        if (currentPerm[currentNum] < values.length) {
                            for (String val : values) {
                                builder.setCharAt(currentNum, val.charAt(0));
                                if (currentPerm[currentNum] < values.length) {
                                    ++currentPerm[currentNum];
                                }
                                if (allPossiblePins.indexOf(builder.toString()) == -1) {
                                    allPossiblePins.add(builder.toString());
                                }
                            }
                        } else {
                            currentPerm[currentNum] = 0;
                            currentNum = currentNum - 1;
                        }
                    } else {
                        if (currentPerm[currentNum] < values.length) {
                            builder.setCharAt(currentNum, values[currentPerm[currentNum]].charAt(0));
                            ++currentPerm[currentNum];
                            ++currentNum;
                        } else {
                            currentPerm[currentNum] = 0;
                            currentNum = currentNum - 1;
                        }
                    }
                }
            }
            if (allPossiblePins.indexOf(builder.toString()) == -1) {
                allPossiblePins.add(builder.toString());
            }
        }
        return allPossiblePins;
    }
}