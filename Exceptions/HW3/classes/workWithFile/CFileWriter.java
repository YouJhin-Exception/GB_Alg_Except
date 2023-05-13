package Exceptions.HW3.classes.workWithFile;

import Exceptions.HW3.abstracts.AFileWriter;
import Exceptions.HW3.exceptions.FileCreateException;
import Exceptions.HW3.exceptions.MyFileCreateException;
import Exceptions.HW3.exceptions.TheSameFileWritingException;

import java.io.FileWriter;
import java.io.IOException;

public class CFileWriter extends AFileWriter {

    // если есть однофамилец пишем в его фаил, нет, создаем нового в базе path
    private final String folderPath;

    public CFileWriter(CFileCreator fileCreator, CFindSameFileName findSameFileName, String folderPath) {
        this.folderPath = folderPath;
        super.fileCreator = fileCreator;
        super.findSameFileName = findSameFileName;
    }

    @Override
    public boolean writeToFile(String[] dataToWrite) throws TheSameFileWritingException, MyFileCreateException {
        String path = this.folderPath + dataToWrite[0] + ".txt";
        if (findSameFileName.findTheSameFileName(dataToWrite[0], this.folderPath)) {
            System.out.println("Добавляем однофамильца");
            try {
                super.fileWriter = new FileWriter(path, true);
                super.fileWriter.write(dataToWrite[1] + "\n");
                super.fileWriter.close();
                System.out.println("Данные сохранены");
            } catch (IOException ex) {
                throw new TheSameFileWritingException(ex.getMessage());

            }
        } else {
            try {
                fileCreator.createFile(path);
                System.out.println("Создан новый фаил");
            } catch (FileCreateException ex) {
                throw new MyFileCreateException(ex.getMessage());
            }
            try {
                super.fileWriter = new FileWriter(path,true);
                super.fileWriter.write(dataToWrite[1]+"\n");
                super.fileWriter.close();
                System.out.println("Данные записаны");
            }catch (IOException ex){
                throw new TheSameFileWritingException(ex.getMessage());
            }
        }
        return true;
    }
}
