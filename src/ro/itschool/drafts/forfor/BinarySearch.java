package ro.itschool.drafts.forfor;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 50};
        int key = 16;

        int result = binarySearch(array, key);
        if (result == -1) {
            System.out.println("Elementul nu a fost găsit în șir.");
        } else {
            System.out.println("Elementul a fost găsit la poziția " + result + ".");
        }
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Elementul nu a fost găsit
    }
}