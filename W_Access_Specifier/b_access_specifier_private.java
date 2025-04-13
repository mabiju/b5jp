package w_access_specifier;

class Student {
    // private int roll = 420;  // cannot accessible out of class
    public int roll = 420;
}

public class b_access_specifier_private {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll number is =" + s1.roll);
    }
}
