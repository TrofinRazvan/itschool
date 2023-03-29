package ro.itschool.session.session6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ForLoop {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        int[] classicArray = {1, 2, 3, 100, 7};
//        System.out.println("array length " + classicArray.length);
//        System.out.println("array value from index 1: " + classicArray[1]);

        int count = 0;

        for (int index = 0; index < classicArray.length; index++) {
            for (int x : classicArray) {

            }
//                System.out.println("array value from index " + index + " is " + classicArray[index]);
        }
        for (int arrayValue : classicArray) {
//            System.out.println("Print from for-each loop: " + arrayValue);
        }

        List<String> anotherArrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            String listValue = "ion" + random.nextInt(1, 10) + "@gmail.com";
            anotherArrayList.add(listValue);
            System.out.println(listValue);
        }

    }
}

