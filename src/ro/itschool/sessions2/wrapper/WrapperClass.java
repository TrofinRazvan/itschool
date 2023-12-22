package ro.itschool.sessions2.wrapper;

public class WrapperClass {

    public static void main(String[] args) {
        int x = 10;
        Integer i1 = x; //boxing
        System.out.println(i1);
        Integer i2 = 10; //boxing
        System.out.println(i2);

        int i3 = Integer.valueOf(15); //unboxing
        System.out.println(i3);
        Integer i4 = Integer.valueOf(20);
        System.out.println(i4);
        Integer i5 = Integer.valueOf("30");
        System.out.println(i5);
        int i6 = Integer.parseInt("45");
        System.out.println(i6);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);
        Boolean b2 = Boolean.valueOf(false);
        System.out.println(b2);

        Character c1 = 'c';
    }
}