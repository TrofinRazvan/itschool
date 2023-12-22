package ro.itschool.sessions2.variables.localvariables;

import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

    public static void main(String[] args) {
        String input = "This is not what you think.";
        Map<Character, Integer> vowelsCounts = countVowels(input);

        for (Map.Entry<Character, Integer> entry : vowelsCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countVowels(String string) {
        string = string.toLowerCase();

        Map<Character, Integer> vowelCount = new HashMap<>();
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);

        for (int index = 0; index < string.length(); index++) {
            char character = string.charAt(index);
            if (vowelCount.containsKey(character)) {
                vowelCount.put(character, vowelCount.get(character) + 1);
            }
        }
        return vowelCount;
    }
}
