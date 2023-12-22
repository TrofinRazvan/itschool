package ro.itschool.sessions2.enumex.coffee;

public class Main {

    public static void main(String[] args) {
        Coffee c1 = Coffee.COFFEE_BLACK;

        switch (c1) {
            case ESPRESSO:
                System.out.println("You ordered an espresso!");
                break;
            case MACCHIATO:
                System.out.println("You ordered a macchiato!");
                break;
            case CAFFE_LATTE:
                System.out.println("You ordered a caffee latte!");
                break;
            case COFFEE_BLACK:
                System.out.println("You ordered a black coffee!");
                break;
            case DECAF:
                System.out.println("You ordered a decaf coffee!");
            default:
                System.out.println("You ordered an another type of coffee!");
        }

        for (Coffee c : Coffee.values()) {
            System.out.println(c.ordinal() + " " + c.name() + " with price " + c.price + " euro.");
        }
    }
}