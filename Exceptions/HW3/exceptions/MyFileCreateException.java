package Exceptions.HW3.exceptions;

public class MyFileCreateException extends FileCreateException {
    public MyFileCreateException(String message) {
        super("Не удалось создать фаил: " + message);
    }
}
