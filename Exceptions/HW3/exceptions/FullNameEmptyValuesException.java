package Exceptions.HW3.exceptions;

public class FullNameEmptyValuesException extends RuntimeException{
    public FullNameEmptyValuesException(){
        super("Пустые значения в ФИО");

    }
}
