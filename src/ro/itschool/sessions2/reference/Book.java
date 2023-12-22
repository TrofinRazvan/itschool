package ro.itschool.sessions2.reference;

public class Book {

    String title;

    public Book(String title) {
        this.title = title;
    }

    public void changeTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = new Book("Introduction to Programming.");

        System.out.println("Original title: " + book.getTitle());

        book.changeTitle("Programming Basics.");

        System.out.println("Updated title: " + book.getTitle());
    }
}