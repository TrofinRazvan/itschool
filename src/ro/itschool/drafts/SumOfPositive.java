package ro.itschool.drafts;

public class SumOfPositive {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, -2};
        System.out.println(num(arr));
    }

    public static int num(int[] input) {
//        int zero = 0;
//        for (int i : input) {
//            if (i > 0) {
//                zero += i;
//            }
//        }
//        return zero;
            int sum = 0;
            for(int i = 0; i < input.length; i++) {
                if(input[i] > 0) {
                    sum += input[i];
                }
            }
            return sum;
    }
}