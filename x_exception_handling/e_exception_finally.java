package x_exception_handling;

public class e_exception_finally {
    public static void main(String[] args) {
        int a = 12, b = 0, result;
        try {
            result = a / b;
            System.out.println("The result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non zero number by a zero : " + e);
        } finally {
            System.out.println("Be careful while dividing any non zero number by zero.");
        }
    }
}
