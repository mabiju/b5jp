package b_basic_io;
import java.util.Scanner;

public class f_simple_interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter principal :");
            double p = sc.nextDouble();
            System.out.println("Enter time :");
            double t = sc.nextDouble();
            System.out.println("Enter rate of interest :");
            double r = sc.nextDouble();
            double si = (p*t*r)/100;
            System.out.println("Simple interest = Rs." + si);
            sc.close();
        }
    }
}
