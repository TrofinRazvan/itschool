package ro.itschool.whatIdid;

public class ReduceButGrow {
//    public static void main(String[] args) {
//        System.out.println(grow());
//    }
    public static int grow(int[] x){

        int product = 1;
        for (int arr : x) {
            product *= arr;
        }

        return product;

    }
}




