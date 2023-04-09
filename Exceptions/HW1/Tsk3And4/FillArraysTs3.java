package Exceptions.HW1.Tsk3And4;

import java.util.Random;

public class FillArraysTs3 {
    protected static float[] rndFills(int lenght) {
        float[] array = new float[lenght];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(47);
        }
        return array;
    }
}
