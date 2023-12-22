package ro.itschool.sessions2.nested.inner.innerstatic;

public class OuterClass {

    public static void main(String[] args) {
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.method();
    }

    static class InnerStaticClass {
        static void method() {
            System.out.println("I love coffee!");
        }
    }
}