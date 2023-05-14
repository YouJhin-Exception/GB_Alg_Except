package Exceptions.HW3.exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException e) {
        super("Ошибка чтения UI: " + e.getMessage());
    }
}
