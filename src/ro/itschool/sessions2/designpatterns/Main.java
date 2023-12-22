package ro.itschool.sessions2.designpatterns;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello, Singleton!");

        System.out.println("Singleton instance hashCode: " + singleton.hashCode());

        Singleton anotherSingleton = Singleton.getInstance("Another Singleton");

        System.out.println("Are the references the same? " + '\'' + (singleton == anotherSingleton));
    }
}