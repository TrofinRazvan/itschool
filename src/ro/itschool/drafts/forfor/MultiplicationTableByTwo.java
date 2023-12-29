package ro.itschool.drafts.forfor;

public class MultiplicationTableByTwo {

    public static void main(String[] args) {

        multiplication(2);
    }
    public static void multiplication(int number) {
        int numberGiven = number;
        for (int index = 1; index <= 10; index++) {
            int result = numberGiven * index;
            System.out.println(numberGiven + " * " + index + " = " + result);
        }
    }
}