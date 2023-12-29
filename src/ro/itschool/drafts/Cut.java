package ro.itschool.drafts;

public class Cut {

    public static void main(String[] args) {
        int[] array = {7, 5, 2, 10};
        int[] result = number(array);

        for (int number : result) {
            System.out.println(number);
        }
    }

    public static int[] number(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = min + i;
        }
        return result;
    }
}