package ro.itschool.drafts;

public class NewOne {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 9};
        System.out.println(sort(array));
    }

    public static int[] sort(int[] numbers) {
//        if (numbers.length == 0) {
//            return new int[0];
//        }
//
//        int start = numbers[0];
//        int last = numbers[numbers.length - 1];
//
//        if (start > last) {
//            int temp = start;
//            start = last;
//            last = temp;
//        }
//
//        int size = last - start + 1;
//        int[] result = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            result[i] = start + i;
//            System.out.println(result[i]);
//        }
//        return result;
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = i + min;
            System.out.println(result[i]);
        }
        return result;
    }
}