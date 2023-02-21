package ro.itschool.whatIdid;

public class Loop {
    public static void main(String[] args) {
        int a = 20;
        double b = 20.2;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println(new Loop() == new Loop());
        System.out.println(new Loop() != new Loop());
    }
}
