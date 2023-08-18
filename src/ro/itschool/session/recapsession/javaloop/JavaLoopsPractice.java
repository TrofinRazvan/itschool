package ro.itschool.session.recapsession.javaloop;

public class JavaLoopsPractice {

    public static void main(String[] args) {
//        printNumbers();
//        generateMultiplicationTable(9);
        calculateSumOfNumbers(5);
    }

    public static void printNumbers() {
        for (int index = 0; index <= 10; index++) {
            System.out.println(index + "\n");
        }
    }

    // 1 x
    public static void generateMultiplicationTable(int number) {
        for (int index = 1; index <= 10; index++) {
            System.out.println(number + " x " + index + " = " + number * index);
        }
    }

    public static void calculateSumOfNumbers(int number) {
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            sum += index;
            if (index == number) {
            } else {
                System.out.println(index + " + ");
            }
        }
        System.out.println(" = ");
        System.out.println(sum);
    }
}