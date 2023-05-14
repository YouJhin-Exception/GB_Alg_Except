package Exceptions.HW3.interfaces;

import Exceptions.HW3.exceptions.MyFileCreateException;
import Exceptions.HW3.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    boolean writeToFile(String[] dataToWrite) throws TheSameFileWritingException, MyFileCreateException, TheSameFileWritingException, MyFileCreateException;
}
