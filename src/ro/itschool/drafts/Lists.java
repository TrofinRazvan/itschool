package ro.itschool.drafts;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ion");
        names.add("Marica");
        names.add("Mihai");

        List<String> names2 = new ArrayList<>();
        names2.add("Razvan");
        names2.add("Ionel");

        String result2 = newOne(names2);
        String result = joinNamesWithComma(names);
        System.out.println(result);
        System.out.println(result2);
    }
    public static String joinNamesWithComma(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < names.size(); index++) {
            if (index > 0) {
                result.append(", ");
            }
            result.append(names.get(index));
        }
        if (!names.isEmpty()) {
            result.append("; ");
        }
        return result.toString();
    }

    public static String newOne(List<String> names2) {
        StringBuilder result2 = new StringBuilder();
        for (int index = 0; index < names2.size(); index++) {
            if ( index > 0) {
                result2.append(", ");
            }
            result2.append(names2.get(index));
        }
        if (!names2.isEmpty()) {
            result2.append("; ");
        }
        return result2.toString();
    }
}