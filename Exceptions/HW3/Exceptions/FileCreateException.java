package Exceptions.HW3.Exceptions;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message){
        super("Фаил не создан: "+message);
    }
}
