package Exceptions.HW3.Exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    //?????
    public FullNameReadFromDataException(String s){
        super("Парс ФИО екс: "+s);
    }
}
