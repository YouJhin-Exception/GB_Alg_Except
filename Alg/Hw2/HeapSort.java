package Alg.Hw2;

public class HeapSort {
    private static int leftChild(int i) { // дети
        return (2 * i + 1);
    }

    private static int rightChild(int i) {
        return (2 * i + 2);
    }

    private static void swap(int[] sortArray, int i, int j) { // обычный свап
        int temp = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] = temp;
    }

    private static void heapify(int[] array, int i, int size) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if (left < size && array[left] > array[i]) largest = left;
        if (right < size && array[right] > array[largest]) largest = right;

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, largest, size);
        }
    }

    //удаление элемента с наивысшим приоритетом (есть в корне)
    public static int pop(int[] array, int size) {
        // если в куче нет элементов
        if (size <= 0) {
            return -1;
        }
        int top = array[0];
        // заменить корень кучи последним элементом массива
        array[0] = array[size - 1];
        // heapify-down на корневом узле
        heapify(array, 0, size - 1);
        return top;
    }

    // пирамидальная сортировка массива array размера n
    public static void heapSort(int[] array) {
        int n = array.length;

        // строим кучу, вызываем heapify, начиная с последнего внутреннего
        // узел до корневого узла
        int i = (n - 2) / 2;
        while (i>=0){
            heapify(array,i--,n);
        }
        // извлекаем из кучи пока не пустая
        while (n>0){
            array[n-1] = pop(array,n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] sortArray = {15,6,23,77,3,56,1,11,2,0};
        heapSort(sortArray);
        for (Integer i: sortArray) {
            System.out.print(i+" ");
        }

    }

}
