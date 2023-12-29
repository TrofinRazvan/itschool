package ro.itschool.drafts.forfor;

import java.util.ArrayList;
import java.util.List;

public class TenOddNumbers {

    public static void main(String[] args) {

        List<Integer> oddNumbers = getTenOddNumbers(1, 50);
        System.out.println(oddNumbers);
    }

    public static List<Integer> getTenOddNumbers(int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        int sum = 0;
        for (int index = start; index <= end; index++) {
            if (index % 2 != 0) {
                numbers.add(index);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
        return numbers;
    }
}