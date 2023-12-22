package ro.itschool.sessions2.lambda;

import java.util.Arrays;
import java.util.List;

public class IntegersList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 43, 21);
        numbers.sort((a, b) -> b.compareTo(a));
        System.out.println(numbers);

        for (Integer sortedNumbers : numbers) {
            System.out.println(sortedNumbers);
        }
    }
}