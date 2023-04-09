package Exceptions.HW1.Tsk3And4;

import java.util.ArrayList;
import java.util.List;

class DifferenceOfArrays {
    protected static List<Float> diffArr(float[] arr1, float[] arr2){

        if (arr1==null || arr2 == null) throw new NullPointerException("Массив нулевой длинны");
        if (arr1.length != arr2.length) throw new IndexOutOfBoundsException("Массивы различной длинны");


        List<Float> resList = new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            resList.add(arr1[i]-arr2[i]);
        }
        return resList;
    }
}
