package Exceptions.HW3.Interfaces;

public interface IWriteToFile {
    public boolean writeToFile(String[] dataToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
