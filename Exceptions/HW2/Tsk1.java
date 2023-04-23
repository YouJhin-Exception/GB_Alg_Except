package Exceptions.HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tsk1 {

    public static float askFloat() {
        Float numb = null; //or -1
        boolean inStat = true;
        while (inStat) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Введите дробное число -> ");
                numb = Float.parseFloat(reader.readLine());
                //System.out.printf("Введенное число равно %.2f\n", numb);
                inStat = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введите ДРОБНОЕ! число");
            }

        }
        return numb;
    }

    public static void main(String[] args) {
        System.out.println(askFloat());

    }
}
