package ro.itschool.session.session9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 100000; index++) {
            arrayList.add("a");
            linkedList.add("a");
        }

        long startTime = System.currentTimeMillis();
        String getArrayValue = arrayList.get(100000);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        String getLinkedValue = linkedList.get(100000);
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (endTime2 - startTime2));
    }
}