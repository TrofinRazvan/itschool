package ro.itschool.sessions2.exceptions;

public class ConnectionDB2 implements AutoCloseable {

    ConnectionDB2(){
        this.open();
    }

    public void open() {
        System.out.println("Open connection.");
    }

    public void close() {
        System.out.println("Close connection.");
    }
}