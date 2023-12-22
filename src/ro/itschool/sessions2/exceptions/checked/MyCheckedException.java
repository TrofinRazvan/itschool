package ro.itschool.sessions2.exceptions.checked;

public class MyCheckedException extends Exception {
    public MyCheckedException() {
        super("This is checked exception! Must be treated!");
    }
}