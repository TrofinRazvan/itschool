package ro.itschool.drafts.forfor;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {

        System.out.println(getOddNumber(2,10));
    }

    public static List<Integer> getOddNumber(int start, int end) {

        List<Integer> oddNumbers = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            if (index % 2 == 0) {
                oddNumbers.add(index);
            }
        }
        return oddNumbers;
    }
}