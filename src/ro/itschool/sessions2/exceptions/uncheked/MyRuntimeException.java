package ro.itschool.sessions2.exceptions.uncheked;

public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){
        super("This is unchecked exception.");
    }

    public MyRuntimeException(String message){
        super(message);
    }
}