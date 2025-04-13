package x_exception_handling;

import java.util.Scanner;

public class g_exception_throw_throws_voter_age {
    public void checkVoterAge(int age) throws ArithmeticException {
        if (age < 18) {
            // System.out.println("You are not eligible to cast your vote by age.");
            throw new ArithmeticException("You are not eligible to cast your vote by age.");
        } else {
            System.out.println("You are eligible to cast your vote by age.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        f_exception_throw_voter_age obj = new f_exception_throw_voter_age();
        obj.checkVoterAge(age);
        sc.close();
    }
}
