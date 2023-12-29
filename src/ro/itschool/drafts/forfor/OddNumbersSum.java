package ro.itschool.drafts.forfor;

public class OddNumbersSum {

    public static void main(String[] args) {

        System.out.println(getOddNumbers(1,20));
    }

    public static int getOddNumbers(int start, int end) {

        int sum = 0;
        for (int index = start; index < end; index++) {
            if (index % 2 != 0) {
                sum += index;
            }
        }
        return sum;
    }
}