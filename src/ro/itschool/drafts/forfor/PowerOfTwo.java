package ro.itschool.drafts.forfor;

public class PowerOfTwo {

    public static void main(String[] args) {
        getNumber(2);
    }

    public static int getNumber(int number) {

        for (int index = 1; index <= 5; index++) {
            int power = (int) Math.pow(number, index);
            System.out.println(number + " ^ " + index + " = " + power);
        }
        return number;
    }
}