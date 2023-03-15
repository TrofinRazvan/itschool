package ro.itschool.whatIdid;

public class Array {


    public static void main(String[] args) {
        int[] anArray = {1, 5, 3, 9, 8, 15, 4, 3};
        double smallest = anArray[0];
        double biggest = anArray[0];
        double result = 0;

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < smallest) {
                smallest = anArray[i];
            }
            if (anArray[i] > biggest) {
                biggest = anArray[i];
            }
            result = Math.round(biggest / 2);

        }
        for (int i = 0; i < anArray.length; i++)
            if (anArray[i] == result)
                System.out.println(anArray[i]);
            System.out.println(result);
            System.out.println(biggest);
            System.out.println(smallest);


    }
}

//    int[] myArray = {1, 5, 3, 9, 8, 15, 4, 3};
//            index      0  1  2  3  4  5   6  7

//    int minInt = 0;

//    int index = -1;

//        for (int j : myArray)
//                if (j > minInt) {
//                minInt = j;
//                }

