package ro.itschool.sessions2.lambda;

public class Main {

    public static void main(String[] args) {
        Function f1 = new Function() {
            @Override
            public double operation(int x) {
                return ++x;
            }
        };
        Function f2 = x -> ++x;

        Function f3 = (x) -> --x;
        Function f4 = (int x) -> ++x;
        Function f5 = x -> {return ++x;};

        BiFunction f6 = (a, b) -> a + b;
        BiFunction f7 = new BiFunction() {
            @Override
            public double operation(int x, int y) {
                return x * y;
            }
        };
        BiFunction f8 = (int x, int y) -> x * y;
        BiFunction f9 = new BiFunction() {
            @Override
            public double operation(int x, int y) {
                return x / y;
            }
        };
        BiFunction f10 = (x, y) -> {return x / y;};

        System.out.println(f1.operation(3));
        System.out.println(f2.operation(3));
        System.out.println(f3.operation(3));
        System.out.println(f4.operation(3));
        System.out.println(f5.operation(3));

        System.out.println(f6.operation(3,3));
        System.out.println(f7.operation(3,3));
        System.out.println(f8.operation(3,3));
        System.out.println(f9.operation(3,3));
        System.out.println(f10.operation(3,3));
    }
}