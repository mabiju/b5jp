// this example includes problem statement, i.e. we cannot divide numbers by zero
package x_exception_handling;

public class a_exception_problem_scenario {
    public static void main(String[] args) {
        int dividend = 10, divisor = 0, quotient;
        quotient = dividend/ divisor;
        System.out.println("The result = " + quotient);
    }
}
