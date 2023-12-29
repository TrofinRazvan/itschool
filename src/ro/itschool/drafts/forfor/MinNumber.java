package ro.itschool.drafts.forfor;

public class MinNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 100, 1000, -100};
        getNumber(arr);
    }

    public static int[] getNumber(int[] number) {
        int minNumber = number[0];
        int minIndex = 0;
        for (int index = 0; index < number.length; index++) {
            if (number[index] < minNumber) {
                minNumber = number[index];
                minIndex = index;
            }
        }
        System.out.println("The smallest number is: " + minNumber);
        System.out.println("Index for the smallest number is at: " + minIndex);
        return number;
    }
}
