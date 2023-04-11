package Alg.Hw2;

public class SomeAlgs {
    public static void main(String[] args) {
        int[] ar1 = {0, 9, 6, 7};
        bblsort(ar1);
        for (Integer i : ar1) {
            System.out.print(i + " ");
        }
    }


    public static void bblsort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    // перегрузка для массивов
    public static int binarySearch(int[] array, int val){
        return binarySearch(array,val,0, array.length-1);
    }
    public static int binarySearch(int[] array, int val, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < val) {
            return binarySearch(array, val, midPoint + 1, max);
        } else if (array[midPoint] > val) {
            return binarySearch(array, val, min, midPoint - 1);
        } else return midPoint;
    }


}
