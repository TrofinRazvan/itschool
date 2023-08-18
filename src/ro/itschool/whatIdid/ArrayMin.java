package ro.itschool.whatIdid;

public class ArrayMin {
    public static void main(String[] args) {

        int[] arr = {4, 5, 8, 5, 6,9};
        int min = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        System.out.println(min);
    }
}