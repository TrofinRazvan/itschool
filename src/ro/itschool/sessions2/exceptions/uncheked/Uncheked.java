package ro.itschool.sessions2.exceptions.uncheked;

public class Uncheked {

    public static void main(String[] args) {
        int x = 4;

        try {
            System.out.println("A");
            if (x > 3) {
                MyRuntimeException e = new MyRuntimeException();
                throw e;
            }
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}