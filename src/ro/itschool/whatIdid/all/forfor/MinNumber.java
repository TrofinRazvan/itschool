package ro.itschool.whatIdid.all.forfor;

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
        System.out.println("Cel mai mic numar este: " + minNumber);
        System.out.println("Indexul celui mai mic numar este: " + minIndex);
        return number;
    }
}
