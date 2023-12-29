package ro.itschool.drafts.forfor;

public class SearchArrayValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 4};
        int targetValue = 54;
        int foundIndex = -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == targetValue) {
                foundIndex = index;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Value " + targetValue + " it was found " + foundIndex + ".");
        } else {
            System.out.println("Value " + targetValue + " it was not found.");
        }
    }
}