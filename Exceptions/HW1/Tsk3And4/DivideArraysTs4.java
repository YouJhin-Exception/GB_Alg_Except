package Exceptions.HW1.Tsk3And4;

import java.util.ArrayList;
import java.util.List;

class DivideArraysTs4 {
    protected static List<Float> divideArrays(float[] arr1, float[] arr2){
        if (arr1==null || arr2 == null) throw new RuntimeException("Массив нулевой длинны");
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы различной длинны");

        List<Float> resList = new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]==0 || arr2[i]==0) throw new RuntimeException("На ноль делить нельзя");
            resList.add(arr1[i]/arr2[i]);
        }
        return resList;
    }
}
