package ro.itschool.whatIdid;

public class ReduceButGrow {
    public static int grow(int[] x){

        int product = 1;
        for (int arr : x) {
            product *= arr;
        }

        return product;

    }
}




