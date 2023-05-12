package Exceptions.HW3.Exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message){
        super("Не удалось создать фаил: "+message);
    }
}
