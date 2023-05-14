package Exceptions.HW3.exceptions;

public class BirthdayFormatException extends RuntimeException {
    public BirthdayFormatException() {
        super("Неверный формат даты");
    }
}
