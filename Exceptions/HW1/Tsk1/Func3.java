package Exceptions.HW1.Tsk1;

class Func3 {
    protected static void printValueByIndex(int[] array, int index) {
        try {
            System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Элемента под таким индексом не существует");
        }
    }
}
