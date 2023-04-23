package Exceptions.HW2;

public class Tsk2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 6, 8, 7, 9, 2, 1, 9}; // если делаем массив double, то получаем бесконечность вместо исключения
            double catchedRes1 = intArray[8] / d; // нет массива для обращения, добавил, ну и деление на 0
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
