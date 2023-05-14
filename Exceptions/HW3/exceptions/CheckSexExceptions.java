package Exceptions.HW3.exceptions;

public class CheckSexExceptions extends RuntimeException {
    public CheckSexExceptions() {
        super("Вы не указали пол");
    }
}
