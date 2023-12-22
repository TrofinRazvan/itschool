package ro.itschool.sessions2.methods;

public class Counter {

    private static int objectCounter = 0;

    public Counter() {
        objectCounter++;
    }

    public static int getObjectCounter() {
        return objectCounter;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();


        System.out.println("Total number is: " + Counter.objectCounter);
    }
}