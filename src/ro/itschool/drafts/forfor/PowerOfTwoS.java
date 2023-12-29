package ro.itschool.drafts.forfor;

public class PowerOfTwoS {

    public static void main(String[] args) {

        int number = 2;
        int result = 1;
        for (int index = 1; index <= 5; index++) {
            result *= number;
            System.out.println(number + " ^ " + index + " = " + result);
        }
    }
}