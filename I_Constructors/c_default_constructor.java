package i_constructors;

class Stud {
    int roll;
    String name;

    Stud() {
        roll = 420;
        name = "Ram";
    }

    public void displayDetails() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}

public class c_default_constructor {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.displayDetails();
    }
}
