package ro.itschool.drafts.forfor;

public class EvenAndOddNumberCounting {

    public static void main(String[] args) {

        getNumbers(1, 20);
    }

    public static void getNumbers(int start, int end) {

        int count = 0;
        for (int index = start; index <= end; index++) {
            if (index % 2 != 0)
                count++;
            System.out.println(count);
        }
    }
}
