package ro.itschool.sessions2.exceptions.checked;

public class Checked {

    public static void main(String[] args) throws MyCheckedException {
        int x = 11;

//        try {                                                     1
//            System.out.println("A");
//        if (x > 2) {
//            MyCheckedException e = new MyCheckedException();
//            throw e;
//        }
//            System.out.println("B");
//        } catch (MyCheckedException exc) {
//            System.out.println("D");
//        } finally {
//            System.out.println("C");
//        }

        try {
            System.out.println("A");
            m(x);
            System.out.println("B");
        } catch (MyCheckedException exc) {
            System.out.println("D");
        } finally {
            System.out.println("C");
        }
    }

    public static void m(int x) throws MyCheckedException {
        if (x > 10) {
            MyCheckedException e = new MyCheckedException();
            throw e;
        }
    }
}