package f_data_types;

import java.util.Scanner;

public class l_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        System.out.println("The sum  = " + (a + b));
        System.out.println("The difference  = " + (a - b));
        System.out.println("The product  = " + (a * b));
        System.out.println("The quotient  = " + (a / b));
        sc.close();
    }
}
