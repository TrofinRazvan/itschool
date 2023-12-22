package ro.itschool.sessions2.exceptions.checked;

public class BaseDerivedException {

    public static void main(String[] args) {

//        try {                                           1
//            System.out.println("A");
//            m(12);
//        } catch (DerivedException e) {
//            System.out.println("C");
//        } catch (BaseException e) {
//            System.out.println("D");
//        } catch (Exception e) {
//            System.out.println("General exception");
//        } finally {
//            System.out.println("E");
//        }

        try {
            int[] x = new int[5];
            x[8] = 10;

            int y = 10/0;

            m(17);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | DerivedException e) {
            System.out.println(e.getMessage());
        } catch (BaseException e) {
            System.out.println("B");
        }
    }

    public static void m(int x) throws DerivedException, BaseException {

        if (x > 15) {
            DerivedException e = new DerivedException();
            throw e;
        }

        if (x < 10) {
            BaseException e = new BaseException();
            throw e;
        }
    }
}