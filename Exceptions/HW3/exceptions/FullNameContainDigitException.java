package Exceptions.HW3.exceptions;

public class FullNameContainDigitException extends RuntimeException{
    public FullNameContainDigitException(){
        super("Данные поля не должны содержать цифры");
    }
}
