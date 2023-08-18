package ro.itschool.whatIdid.all.forfor;

import java.util.ArrayList;
import java.util.List;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        List<Integer>[] result = getTheseNumbers(1, 10);
        List<Integer> evenNumbers = result[0];
        List<Integer> oddNumbers = result[1];

        System.out.println("Even numbers are: " + evenNumbers);
        System.out.println("Odd numbers are: " + oddNumbers);
    }

    public static List<Integer>[] getTheseNumbers(int start, int end) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            if (index % 2 == 0) {
                even.add(index);
                System.out.println();
            }
            if (index % 2 != 0) {
                odd.add(index);
            }
        }
        List<Integer>[] result = new List[2];
        result[0] = even;
        result[1] = odd;
        return result;
    }
}