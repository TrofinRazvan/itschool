package ro.itschool.sessions2.oop.inheritance.hasa.two;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}