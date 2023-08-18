package ro.itschool.whatIdid.all.forfor;

public class MaxNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 100, 1000, -100};
        getNumber(arr);
    }

    public static int[] getNumber(int[] number) {
        int maxNumber = number[0];
        int maxIndex = 0;

        for (int index = 0; index < number.length; index++) {
            if (number[index] > maxNumber) {
                maxNumber = number[index];
                maxIndex = index;
            }
        }
        System.out.println("Cel mai mare numar este: " + maxNumber);
        System.out.println("Indexul celui mai mare numar este: " + maxIndex);
        return number;
    }
}
