package ro.itschool.drafts.forfor;

public class PowerOfTwoM {

    public static void main(String[] args) {

        getNumber(2);
    }

    public static int getNumber(int number) {

        for (int index = 1; index <=5; index++) {
            int power = 1;
            for (int i = 1; i <= index; i++) {
                power *= number;
            }
            System.out.println(number + " ^ " + index + " = " + power);
        }
        return number;
    }
}