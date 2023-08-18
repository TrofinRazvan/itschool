package ro.itschool.whatIdid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class For {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 5, 7, 9};
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(i);
        for (int index = 0; index < arr.length; index += 3) {
            int element = arr[index];
            System.out.println(element);
        }
        for (int index = 0; index < arr.length; index++) {
            int currentNumber = arr[index];
            System.out.println(currentNumber);
        }
//        List<String> names = new ArrayList<>();
//        names.add("Ion");
//        names.add("George");
//        names.add("Mihai");
//        for (int index = 0; index < names.size(); index++) {
//            String currentName = names.get(index);
//            System.out.println(currentName);
//        }

//        Set<Integer> numbersSet = new HashSet<>();
//        numbersSet.add(10);
//        numbersSet.add(11);
//        numbersSet.add(12);
//        int sum = 0;
//        for (Integer num : numbersSet) {
//            sum += num;
//        }
//        System.out.println(sum);
    }
}
