// demonstrate the use of "super" keyword to access method of super class
package q_inheritance;

class Teacher {
    void Study() {
        System.out.println("Teacher is studying......");
    }
}

class Student extends Teacher {
    void Study() {
        super.Study(); // method from super class
        System.out.println("Student is studying......");
    }
}

public class e_single_same_method_super {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study(); // executes super class method first
    }
}
