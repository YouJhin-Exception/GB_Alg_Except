package Exceptions.HW3.classes.workWithFile;

import Exceptions.HW3.abstracts.AFileCreator;
import Exceptions.HW3.exceptions.FileCreateException;

import java.io.File;
import java.io.IOException;


public class CFileCreator extends AFileCreator {

    // создаем фаил по указанному пути
    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }

    }
}
