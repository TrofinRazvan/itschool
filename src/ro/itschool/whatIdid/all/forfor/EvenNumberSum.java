package ro.itschool.whatIdid.all.forfor;

public class EvenNumberSum {

    public static void main(String[] args) {

        System.out.println(getNumbers(1,20));
    }

    public static int getNumbers(int start, int end) {

        int sum = 0;
        for (int index = start; index < end; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }
}
