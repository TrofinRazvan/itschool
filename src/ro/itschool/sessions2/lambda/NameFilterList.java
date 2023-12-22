package ro.itschool.sessions2.lambda;

import java.util.Arrays;
import java.util.List;

public class NameFilterList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ionel", "Marcel", "Tionel", "Gabriel", "Anioanei");
        boolean found = list.stream()
                        .anyMatch(s -> s.startsWith("A"));

        if (!found) {
            System.out.println("No name found.");
        } else {
            list.stream()
                    .filter(s -> s.startsWith("A"))
                    .forEach(System.out::println);
        }
    }
}