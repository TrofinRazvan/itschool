package ro.itschool.sessions2.generictype;

public class Box<T> {

    T contain;

    Box() {

    }

    Box(T contain) {
        this.contain = contain;
    }

    public String toString() {
        return this.contain + " ";
    }

    public static <U> void staticMethod() {

    }
}