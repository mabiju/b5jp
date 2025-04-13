package i_constructors;

public class h_copy_constructor {
    int roll;
    String name;

    public h_copy_constructor(int r, String n) {
        roll = r;
        name = n;
    }
    // copy constructor
    public h_copy_constructor(h_copy_constructor stu) {
        System.out.println("\nAfter invoking copy constructor:");
        roll = stu.roll;
        name = stu.name;
    }

    int displayRoll() {
        return roll;
    }

    String displayName() {
        return name;
    }

    public static void main(String[] args) {
        h_copy_constructor s1 = new h_copy_constructor(420, "Ram");
        System.out.println("Roll = " + s1.displayRoll());
        System.out.println("Name = " + s1.displayName());

        h_copy_constructor s2 = new h_copy_constructor(s1);
        System.out.println("Roll = " + s2.displayRoll());
        System.out.println("Name = " + s2.displayName());
    }
}
