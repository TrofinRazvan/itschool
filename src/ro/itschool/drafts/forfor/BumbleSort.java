package ro.itschool.drafts.forfor;

public class BumbleSort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int n = array.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//         Afișare array sortat
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}