package ro.itschool.whatIdid;

public class SChaining {

    public static void main(String[] args) {
        String text = "Hello!";
        String result = text.toUpperCase().substring(2).concat(" World").replace("l","L");
        System.out.println(result);
    }
}
