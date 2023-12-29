package ro.itschool.drafts;

import java.util.HashSet;
import java.util.Set;

public class Letter {

    public static void main(String[] args) {
        String[] stringArray = {"zabc", "bcd", "def", "ghv","iop"};
        String result = duplicates(stringArray);

        System.out.println("Result: " + result);
    }

    public static String duplicates(String[] s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> string = new HashSet<>();

        for (String i : s) {
            for (char j : i.toCharArray()) {
              if (string.add(j)) {
                  sb.append(j);
              }
            }
        }
        return sb.toString();
    }
}