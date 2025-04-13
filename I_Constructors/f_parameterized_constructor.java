package i_constructors;

public class f_parameterized_constructor {
    int roll;
    String name;

    public f_parameterized_constructor(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        f_parameterized_constructor obj1 = new f_parameterized_constructor(11, "Ram");
        f_parameterized_constructor obj2 = new f_parameterized_constructor(12, "Sita");
        obj1.display();
        obj2.display();
    }
}
