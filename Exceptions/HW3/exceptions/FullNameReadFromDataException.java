package Exceptions.HW3.exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    //?????
    public FullNameReadFromDataException(String s){
        super("Парс ФИО екс: "+s);
    }
}
