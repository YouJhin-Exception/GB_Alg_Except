package Exceptions.HW3.classes.checkInputData;

import Exceptions.HW3.abstracts.ACheckData;
import Exceptions.HW3.exceptions.CheckSexExceptions;
import Exceptions.HW3.exceptions.IncorrectSexValueException;

public class СCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if (data.equals("")) throw new CheckSexExceptions();
        if (!(data.contains("m") || data.contains("f"))) throw new IncorrectSexValueException();
        return true;
    }
}
