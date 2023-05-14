package Exceptions.HW3;

import Exceptions.HW3.classes.CLaunching;
import Exceptions.HW3.classes.checkInputData.*;
import Exceptions.HW3.classes.parseData.CDataParseProcessor;
import Exceptions.HW3.classes.ui.CGetData;
import Exceptions.HW3.classes.workWithFile.CFileCreator;
import Exceptions.HW3.classes.workWithFile.CFileWriter;
import Exceptions.HW3.classes.workWithFile.CFindSameFileName;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathDB = "C:\\Users\\YouJhin\\Desktop\\GB_Alg_Except\\Exceptions\\HW3\\dataBase\\"; // мой абсолютный путь к БД

        CLaunching launching = new CLaunching(new CGetData(),
                new CDataParseProcessor(),
                new CCheckDataProcessor(new CCheckQuantity(),
                        new CCheckFullName(),
                        new CCheckBirthday(),
                        new СCheckSex()),
                new CFileWriter(new CFileCreator(),
                        new CFindSameFileName(), pathDB));

        launching.run();

        //while (true){по хорошему можно еще добавить в ui и CDPP команду на выход}

    }
}
