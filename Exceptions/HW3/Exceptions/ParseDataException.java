package Exceptions.HW3.Exceptions;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message){
        super("Ошибка в разборе данных: "+ message);
    }
}
