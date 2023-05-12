package Exceptions.HW3.Exceptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String str){
        super("Не удалось преобразовать строку в число: "+ str);
    }
}
