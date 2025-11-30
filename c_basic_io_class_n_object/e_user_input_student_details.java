package c_basic_io_class_n_object;

import java.util.Scanner;

class Studentt {
    public int roll;
    public String name, address;

    void getData(Scanner sc) {
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }

    void displayData() {
        System.out.println("Roll number  = " + roll);
        System.out.println("Name  = " + name);
        System.out.println("Address  = " + address);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Student 1:");
        Studentt s1 = new Studentt();
        s1.getData(sc);

        System.out.println("Enter the details of Student 2:");
        Studentt s2 = new Studentt();
        s2.getData(sc);

        System.out.println("Enter the details of Student 3:");
        Studentt s3 = new Studentt();
        s3.getData(sc);

        System.out.println("\nDisplaing  the details of Student 1");
        s1.displayData();
        System.out.println("\nDisplaing  the details of Student 2");
        s2.displayData();
        System.out.println("\nDisplaing  the details of Student 3");
        s3.displayData();
    }
}