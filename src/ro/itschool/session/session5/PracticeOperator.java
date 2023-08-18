package ro.itschool.session.session5;

public class PracticeOperator {

    private double BankAccount;
    //constants are always written with caps lock
    public static String USER_CNP = "23456789032";

    public static void main(String[] args) {
        // short value = 343242344;
        int x = 10;
        int y = 20;
        if (x < y) {
            //code
        }

        short ab = 34;
        int a = 10;
        long b = 15;
        long c = a * b;
    }

    class Test {
        static int age = 10;

        public static void main(String[] args) {
            String test = USER_CNP;
            PracticeOperator practiceOperator = new PracticeOperator();
//            practiceOperator.getName();

            if (false) {
                System.out.println("hello");
            } else if (false) {
                //
            } else if (false) {
                //
            } else {
                //
            }

            int horsepower = 250;
            int result = horsepower < 100 ? horsepower + 10 : horsepower - 10;
            // ? - daca valoarea este "true", atunci mai aduci cu 10...
            // : - sau
            System.out.println(result);

            String raceResult = horsepower < 100 ? "start race" : "stop race";

            String raceResult2;
            if (horsepower < 100) {
                raceResult2 = "stop race";
            } else {
                raceResult2 = "start race";
            }
        }
        public int computeTwoNumbers(int a, int b) {
            return a + b;
        }
    }
}