package k_variable_constants;

class Student {
    static int clzId = 27;
    int roll;
    String name;

    public void inputDetails(int r, String n) {
        roll = r;
        name = n;
    }

    public void displayDetails() {
        System.out.println("\nCollege ID = " + clzId);
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}

public class a_variable_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails(11, "Ram Thapa");
        s1.displayDetails();

        Student s2 = new Student();
        s2.inputDetails(12, "Sita Rai");
        s2.displayDetails();
    }
}
