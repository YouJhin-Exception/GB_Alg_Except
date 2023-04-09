package Exceptions.HW1.Tsk3And4;

class Main {
    public static void main(String[] args) {
        float[] firstArray = Exceptions.HW1.Tsk3And4.FillArraysTs3.rndFills(10);
        float[] secondArray = Exceptions.HW1.Tsk3And4.FillArraysTs3.rndFills(10);
        float[] testArr = null;
        float[] testArrZero = {1,2,3,0};
        float[] testArrZero2 = {1,2,3,4};

        //System.out.println(Arrays.toString(firstArray));
        // 3-е задание
        System.out.println(DifferenceOfArrays.diffArr(firstArray, secondArray));

        //4-е задание
        System.out.println(DivideArraysTs4.divideArrays(firstArray,secondArray));
    }
}
