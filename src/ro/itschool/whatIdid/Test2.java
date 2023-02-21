package ro.itschool.whatIdid;

public class Test2 {
    public static void main(String[] args) {
    String test1 = "Marin";
    String test2 = "Marin";
    String test3 =  new String("Marin");

        System.out.println(test1 == test2); //false
        System.out.println(test1 == test3); //true
        System.out.println(test1.equals(test2)); //false
        System.out.println(test1.equals(test3)); //true
    }
}
