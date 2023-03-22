package ro.itschool.session.session10;

public class PracticeWithMethod {

    public static void main(String[] args) {
        String name = getName();
        System.out.println("Name value is: " + name);
        printSumNumbers(10, 15);
    }

    public static String getName() {
        String someName = "George";
        return someName;
    }

    public static void printSumNumbers(int a, int b) {
        System.out.println("This is the sum: " + (a + b));
    }
    public Human getNewHuman() {
        Human human = new Human();
        return human;
    }

}
