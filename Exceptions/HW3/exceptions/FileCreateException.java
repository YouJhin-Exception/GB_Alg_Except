package Exceptions.HW3.exceptions;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("Фаил не создан: " + message);
    }
}
