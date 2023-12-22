package ro.itschool.sessions2.generictype;

public class Main {

    public static void main(String[] args) {
        new Box();

        new Box<Pencil>();
        new Box<Book>();
        new Box<Integer>();
        new Box<int[]>();
    }
}