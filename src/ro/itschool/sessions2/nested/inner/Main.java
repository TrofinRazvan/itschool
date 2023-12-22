package ro.itschool.sessions2.nested.inner;

public class Main {

    public static void main(String[] args) {
        A instanceA = new A();
        A.C insstanceC =new A.C();

        A.B instanceB = instanceA.new B();
        instanceA.x++;
        A.y++;
    }
}