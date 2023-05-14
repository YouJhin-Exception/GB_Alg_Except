package Exceptions.HW3.classes.checkInputData;

import Exceptions.HW3.abstracts.ACheckFullName;
import Exceptions.HW3.exceptions.FullNameContainDigitException;
import Exceptions.HW3.exceptions.FullNameEmptyValuesException;

public class CCheckFullName extends ACheckFullName {
    @Override
    public boolean checkFullName(String[] fullName) {
        for (int i = 0; i < fullName.length; i++) {
            if (fullName[i].length() == 0) throw new FullNameEmptyValuesException();
            for (int j = 0; j < fullName[i].length(); j++) {
                if (Character.isDigit(fullName[i].charAt(j))) throw new FullNameContainDigitException();

            }

        }
        return true;
    }
}
