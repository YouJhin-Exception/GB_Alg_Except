package Exceptions.HW3.abstracts;

import Exceptions.HW3.classes.workWithFile.CFileCreator;
import Exceptions.HW3.classes.workWithFile.CFindSameFileName;
import Exceptions.HW3.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindSameFileName findSameFileName;

}
