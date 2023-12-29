package ro.itschool.drafts.forfor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] array = {2,3,4,3,2,2,2,2};

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }

        System.out.println("Array without duplicate: " + Arrays.toString(resultArray));
    }
}