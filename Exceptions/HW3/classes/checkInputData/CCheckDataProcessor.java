package Exceptions.HW3.classes.checkInputData;

import Exceptions.HW3.abstracts.ACheckData;
import Exceptions.HW3.abstracts.ACheckDataProcessor;
import Exceptions.HW3.abstracts.ACheckFullName;
import Exceptions.HW3.abstracts.ACheckQuantity;

public class CCheckDataProcessor extends ACheckDataProcessor {

    public CCheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public boolean checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Дата рождения корректна");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("ФИО корректны");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Длинна корректна");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Пол корректен");
        return true;
    }
}
