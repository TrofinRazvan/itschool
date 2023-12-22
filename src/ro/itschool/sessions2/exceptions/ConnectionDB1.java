package ro.itschool.sessions2.exceptions;

public class ConnectionDB1 {

   ConnectionDB1() {
        this.open();
    }

    public void open() {
        System.out.println("The resource has been opened.");
    }

    public void close(){
        System.out.println("The resource has been closed.");
    }
}