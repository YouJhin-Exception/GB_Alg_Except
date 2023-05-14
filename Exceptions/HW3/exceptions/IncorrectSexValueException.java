package Exceptions.HW3.exceptions;

public class IncorrectSexValueException extends RuntimeException {
    public IncorrectSexValueException() {
        super("Неверное значение поля, только m/f");
    }
}
