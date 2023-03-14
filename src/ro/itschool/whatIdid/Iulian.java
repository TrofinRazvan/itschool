package ro.itschool.whatIdid;

public class Iulian {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 5, 8, 5, 6, 9};
        int max = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
                System.out.println("Am gasit un element mai mare la pozitia " + index + " cu valoarea= " + arr[index]);
            }
            System.out.println(max);
        }

    }
}















//        int maxInt = 0;
//
//        int index = -1;
//        for (int j : myArray)
//            if (j > maxInt) {
//                maxInt = j;
//            }
//        System.out.println(maxInt);
//    }



