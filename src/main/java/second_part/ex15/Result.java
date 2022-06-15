package second_part.ex15;

import com.sun.jdi.Value;

import java.util.*;

public class Result {
    public static void isValid(String str) {
        List<Character> charList = new ArrayList<>();
        makeCharList(str, charList);
        if (validateCharList(str, charList)) return;
        Map<Character, Integer> stringMap = new HashMap<>();
        makeStringMap(stringMap, charList);
        Integer minValue = Integer.MAX_VALUE;
        Integer maxValue = Integer.MIN_VALUE;
        computeMinAndMaxValue(stringMap, minValue, maxValue);

    }

    private static boolean validateCharList(String str, List<Character> charList) {
        int toValidateCharList = (int) charList.stream().filter(e -> e == str.charAt(0)).count();
        if(toValidateCharList == str.length()){
            System.out.println("Your should use more different characters");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();

        isValid(str);

    }

    private static void computeMinAndMaxValue(Map<Character, Integer> stringMap, Integer minValue, Integer maxValue) {
        Iterator<Map.Entry<Character, Integer>> new_Iterator
                = stringMap.entrySet().iterator();
        while (new_Iterator.hasNext()) {
            Map.Entry<Character, Integer> new_Map = new_Iterator.next();
            if (new_Map.getValue() > maxValue) {
                maxValue = new_Map.getValue();
            }
            if (new_Map.getValue() < minValue) {
                minValue = new_Map.getValue();
            }

        }
        isValidOrNat(minValue, maxValue);
    }

    private static void isValidOrNat(Integer minValue, Integer maxValue) {
        if (maxValue - minValue > 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    private static void makeStringMap(Map<Character, Integer> stringMap, List<Character> charList) {
        List<Character> distinctList = charList.stream().distinct().toList();
        for (int i = 0; i < distinctList.size(); i++) {
            int k = i;
            int value = (int) (charList.stream().filter(e -> e == distinctList.get(k)).count());
            stringMap.put(distinctList.get(k), value);

        }
    }

    private static void makeCharList(String str, List<Character> charList) {
        for (int i = 0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }
    }
}

