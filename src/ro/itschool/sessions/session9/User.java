package ro.itschool.sessions.session9;

public class User {

    public String name;

    public static void addNumbersStatic(int a, int b) {
        System.out.println(a + b);
    }

    public void addNumbersNonStatic(int a, int b) {
        System.out.println(a + b);
    }
}