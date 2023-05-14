package Exceptions.HW3.classes.ui;

import Exceptions.HW3.abstracts.AGetData;
import Exceptions.HW3.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// консоль ввода
public class CGetData extends AGetData {
    BufferedReader bufferedReader;

    public CGetData() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String helloText = """
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество дата_рождения номер_телефона пол.
                                
                Форматы данных:
                Фамилия, имя, отчество - строки.            
                Дата_рождения - строка формата dd.mm.yyyy.           
                Номер_телефона - целое беззнаковое число без форматирования, 9 символов
                Пол - символ латиницей f или m.
                """;
        System.out.println(helloText);
        System.out.println("Введите данные: "); // проверить на перенос
        String inData = "";
        try {
            inData = this.bufferedReader.readLine();
        } catch (IOException ex) {
            throw new GetDataException(new IOException());
        }
        return inData;
    }
}
