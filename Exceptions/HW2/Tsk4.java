package Exceptions.HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tsk4 {
    public static void main(String[] args) {
        System.out.print("Введите любой текст кроме пустой строки ->");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            if (line.trim().isEmpty()) throw new RuntimeException("Пустую строку вводить нельзя!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
