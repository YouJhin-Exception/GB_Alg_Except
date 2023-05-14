package Exceptions.HW3.classes.checkInputData;

import Exceptions.HW3.abstracts.ACheckData;
import Exceptions.HW3.exceptions.BirthdayFormatException;

public class CCheckBirthday extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        String[] inputData = data.split("\\.");
        // проверка формата 00.00.0000
        if (inputData.length != 3 || inputData[0].length() != 2 || inputData[1].length() != 2 || inputData[2].length() != 4)
            throw new BirthdayFormatException();
        // проверка на цифры
        for (String s : inputData) {
            for (int i = 0; i < s.length(); i++) {
                if (!(Character.isDigit(s.charAt(i))))
                    throw new BirthdayFormatException();

            }
        }
        return true;
    }
}
