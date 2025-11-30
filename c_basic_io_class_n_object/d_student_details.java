package c_basic_io_class_n_object;

class Stud {
    int roll, age;
    String name, address;

    void inputDetails(int r, int a, String n, String ad) {
        roll = r;
        age = a;
        name = n;
        address = ad;
    }

    void displayDetails() {
        System.out.println("\nRoll number = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }
}

public class d_student_details {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        Stud s2 = new Stud();
        s1.inputDetails(420, 25, "Ram", "Ghopteodar");
        s2.inputDetails(423, 22, "Sita", "Anakantar");
        s1.displayDetails();
        s2.displayDetails();
    }
}
