package ro.itschool.whatIdid;

import java.util.List;
import java.util.stream.IntStream;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {43, 21, 43, 53};
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);
    }
}

