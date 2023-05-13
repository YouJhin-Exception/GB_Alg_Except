package Exceptions.HW3.exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException(){
        super("Неверное количество вводимых данных");
    }
}
