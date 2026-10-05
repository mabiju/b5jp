package c_basic_io_class_n_object;

import java.util.Scanner;

class Studentt
{
    public int roll;
    public String name, address;

    void getData(Scanner sc)
    {
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }
    void displayData()
    {
        System.out.println("\nRoll Number = " + roll);
        System.out.println("Name =" + name);
        System.out.println("Address =" + address);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of a Student One:");
        Studentt s1 = new Studentt();
        s1.getData(sc);

        System.out.println("\nEnter the details of a Student Two:");
        Studentt s2 = new Studentt();
        s2.getData(sc);

        System.out.println("\nEnter the details of a Student Three:");
        Studentt s3 = new Studentt();
        s3.getData(sc);

        System.out.println("\nDisplaying the details of Student One:");
        s1.displayData();
        System.out.println("\nDisplaying the details of Student Two:");
        s2.displayData();
        System.out.println("\nDisplaying the details of Student Three:");
        s3.displayData();
    }
}
