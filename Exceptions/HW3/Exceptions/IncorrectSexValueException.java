package Exceptions.HW3.Exceptions;

public class IncorrectSexValueException extends RuntimeException{
    public IncorrectSexValueException(){
        super("Неверное значение поля, только м/ж");
    }
}
