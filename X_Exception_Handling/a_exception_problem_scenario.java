// this example includes problem statement, i.e. we cannot divide numbers by zero
package x_exception_handling;

public class a_exception_problem_scenario {
    public static void main(String[] args) {
        // int a = 12, b = 3, result;
        int a = 12, b = 0, result;
        result = a / b;
        System.out.println("The result = " + result);
    }
}
