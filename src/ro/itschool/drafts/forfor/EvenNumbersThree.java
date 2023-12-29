package ro.itschool.drafts.forfor;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersThree {

    public static void main(String[] args) {

        System.out.println(getEventhree(1,10));
    }

    public static List<Integer> getEventhree(int start, int end) {

        List<Integer> evenNumber = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            if (index % 2 == 0) {
                evenNumber.add(index);
            }
        }
        return evenNumber;
    }
}