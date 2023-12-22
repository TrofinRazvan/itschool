package ro.itschool.sessions2.mathsystem;

public class MathClass {

    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.pow(2,10);
        int c = (int) Math.sqrt(100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.err.println("Error message!");
    }
}