package Exceptions.HW3.Exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException e){
        super("Ошибка чтения UI: "+e.getMessage());
    }
}
