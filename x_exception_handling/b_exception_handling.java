package x_exception_handling;

public class b_exception_handling {
    public static void main(String[] args) {
        int dividend = 10, divisor = 0, quotient;
        try {
            quotient = dividend / divisor;
            System.out.println("The result = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non zero value by a zero : " + e);
        }

    }
}
