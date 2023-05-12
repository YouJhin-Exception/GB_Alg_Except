package Exceptions.HW3.Exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException(){
        super("Неверное количество вводимых данных");
    }
}
