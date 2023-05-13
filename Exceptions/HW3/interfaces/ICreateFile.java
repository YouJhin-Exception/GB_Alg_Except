package Exceptions.HW3.interfaces;

import Exceptions.HW3.exceptions.FileCreateException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException, FileCreateException;
}
