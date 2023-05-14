package Exceptions.HW3.classes.checkInputData;

import Exceptions.HW3.abstracts.ACheckQuantity;
import Exceptions.HW3.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String[] data) {
        if (data.length != 6) throw new CheckQuantityException();
        return true;
    }
}
