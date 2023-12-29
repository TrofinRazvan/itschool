package ro.itschool.drafts.forfor;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {

        System.out.println(getEvenNumbers(1,10));
    }

    public static List<Integer> getEvenNumbers(int start, int end) {


        List<Integer> evenNumbers = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            if (index % 2 == 0) {
                evenNumbers.add(index);
            }
        }
        return evenNumbers;
    }
}
