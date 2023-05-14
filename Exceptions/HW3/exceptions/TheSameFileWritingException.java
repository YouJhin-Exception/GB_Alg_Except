package Exceptions.HW3.exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("Фаил не найден: " + message);
    }
}
