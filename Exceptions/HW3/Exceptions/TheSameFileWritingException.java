package Exceptions.HW3.Exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message){
        super("Фаил не найден: "+message);
    }
}
