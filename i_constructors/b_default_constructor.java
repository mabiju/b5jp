package i_constructors;

class Student {
    public Student() {
        System.out.println("This is default constructor define outside of main class");
    }
}

public class b_default_constructor {
    public static void main(String[] args) {
        // Student s1 = new Student();
        new Student();
    }
}
