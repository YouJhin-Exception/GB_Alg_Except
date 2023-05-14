package Exceptions.HW3.exceptions;

public class ParseDataToIntegerException extends NumberFormatException {
    public ParseDataToIntegerException(String str) {
        super("Не удалось преобразовать строку в число: " + str);
    }
}
