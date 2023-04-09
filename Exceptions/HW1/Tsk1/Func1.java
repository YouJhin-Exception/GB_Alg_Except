package Exceptions.HW1.Tsk1;

class Func1 {
    protected static void dev(int a, int b) {
        try {
            System.out.println("devide - " + a / b);
        } catch (ArithmeticException ex) {
            System.err.println("Нельзя делить на ноль dumbass ");
        }
    }
}
