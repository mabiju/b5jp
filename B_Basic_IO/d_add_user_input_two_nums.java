package b_basic_io;

import java.util.Scanner;

public class d_add_user_input_two_nums {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int a = sc.nextInt();
            System.out.println("Enter another number :");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum of " + a + " and " + b + " = " + sum);
            sc.close();
        }
    }
}
