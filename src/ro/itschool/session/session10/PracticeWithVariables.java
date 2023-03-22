package ro.itschool.session.session10;

import java.util.List;

public class PracticeWithVariables {
    public static String colour = "red";
    String name = "Marius";

    public void genericMethod() {
        int age = 10;
    }

    public static void printElementsFromList(List<String> stringElements) {
        for (String element : stringElements) {
            System.out.println(element);
        }
    }

}
