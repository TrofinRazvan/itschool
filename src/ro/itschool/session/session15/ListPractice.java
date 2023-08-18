package ro.itschool.session.session15;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        String[] city = {"Iasi", "Bucuresti", "Timisoara"};
//        System.out.println("This is " + city[2] + " . ");
        for (int index = 0; index < city.length; index++) {
            if (city[index].equalsIgnoreCase("bucuresti")) {
//                System.out.println("Bucuresti is on index: " + index);
                break;
            }
        }
        List<String> names = new ArrayList<>();
        names.add("Ma ri a   ");
        names.add(1, "Andrei");
        names.add(2, "Marian");
//        System.out.println(names);

        names.remove(0);
//        System.out.println(names);
    }
}