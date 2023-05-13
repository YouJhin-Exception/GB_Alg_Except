package Exceptions.HW3.abstracts;

import Exceptions.HW3.interfaces.ICheckBirthday;
import Exceptions.HW3.interfaces.ICheckFullName;
import Exceptions.HW3.interfaces.ICheckQuantity;
import Exceptions.HW3.interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckQuantity, ICheckFullName, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
