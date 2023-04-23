package Exceptions.HW2;
public class Tsk3 {
    public static void main(String[] args) { //exc не нужно
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..."); //более общие вниз
        }
    }

    public static void printSum(Integer a, Integer b) { //exc не нужно
        System.out.println(a + b);
    }

}

