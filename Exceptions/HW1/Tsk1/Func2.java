package Exceptions.HW1.Tsk1;

class Func2 {

    protected static void sum(Integer num1, Integer num2) {
        try {
            System.out.printf("%d + %d = %d", num1, num2, num1 + num2);

        } catch (NullPointerException ex) {
            System.err.println("Отсутствует значение переменной");
        }
    }
}
