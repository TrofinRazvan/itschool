package ro.itschool.sessions.recapsession;

import java.util.Arrays;

public class LambdaPrintSumOfEvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Lambda(numbers);
    }

    public static void Lambda(int[] numberArray) {
        int sumOfEvenNumbers = Arrays.stream(numberArray)
                .filter(value -> value % 2 == 0)
                .sum();
        System.out.println(sumOfEvenNumbers);
    }
}