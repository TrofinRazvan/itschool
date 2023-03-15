package ro.itschool.whatIdid;

public class Array1 {
    public static void main(String[] args) {

        int[] myArray = {2, 5, 3, 8, 5, 7};
        for (int index = 0; index < myArray.length; index++) {
            for (int y = 0; y < myArray.length; y++) {
                if (myArray[index] + myArray[y] == 10) {
                    System.out.println(myArray[index] + " " + myArray[y]);
                }
            }


        }
        for (int index = 0; index < myArray.length; index++) {
            for (int y = 0; y < myArray.length; y++) {
                if (myArray[index] + myArray[y] == 8) {
                    System.out.println(myArray[index] + " " + myArray[y]);

                }
            }
        }
    }
}

