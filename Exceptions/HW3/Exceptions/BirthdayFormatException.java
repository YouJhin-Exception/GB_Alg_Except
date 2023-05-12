package Exceptions.HW3.Exceptions;

public class BirthdayFormatException extends RuntimeException {
    public BirthdayFormatException(){
        super("Неверный формат даты");
    }
}
