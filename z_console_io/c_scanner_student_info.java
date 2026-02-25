package z_console_io;

import java.util.Scanner;

public class c_scanner_student_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number:");
        int roll = sc.nextInt();

        System.out.println("Enter your name: ");
        sc.nextLine();
        // String name = sc.next();
        String name = sc.nextLine();

        System.out.println("Enter your address:");
        // String address = sc.next();
        String address = sc.nextLine();

        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        sc.close();
    }
}
