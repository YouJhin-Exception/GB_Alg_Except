package Exceptions.HW1.Tsk3And4;

class Main {
    public static void main(String[] args) {
        float[] firstArray = Exceptions.HW1.Tsk3And4.FillArraysTs3.rndFills(10);
        float[] secondArray = Exceptions.HW1.Tsk3And4.FillArraysTs3.rndFills(10);
        float[] nullArr = null;
        float[] arrayWithZero = {1,2,3,0,5,6,7,8,9,10};


        //System.out.println(Arrays.toString(firstArray));
        // 3-е задание
        System.out.println(DifferenceOfArrays.diffArr(firstArray, secondArray));

        //4-е задание
        System.out.println(DivideArraysTs4.divideArrays(firstArray,secondArray));
    }
}
