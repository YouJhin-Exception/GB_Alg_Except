package Exceptions.HW3.Exceptions;

import java.awt.*;

public class CheckSexExceptions  extends RuntimeException{
    public CheckSexExceptions(){
        super("Вы не указали Ваш пол");
    }
}
