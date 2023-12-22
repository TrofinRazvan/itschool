package ro.itschool.sessions2.oop.inheritance.hasa.two;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rey","J.D. Salinger");
        Book book2 = new Book("To kill a Mockingbird","Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook(book1);

        System.out.println();

        library.displayBooks();
    }
}
