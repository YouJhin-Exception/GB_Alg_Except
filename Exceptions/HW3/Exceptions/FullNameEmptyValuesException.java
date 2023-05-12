package Exceptions.HW3.Exceptions;

public class FullNameEmptyValuesException extends RuntimeException{
    public FullNameEmptyValuesException(){
        super("Пустые значения в ФИО");

    }
}
