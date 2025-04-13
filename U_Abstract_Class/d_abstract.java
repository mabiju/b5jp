package u_abstract_class;

abstract class Santothimi {
    // abstract method
    abstract void hi();

    // non abstract method
    public void hello() {
        System.out.println("Hello Sanothimi");
    }
}

class Student extends Santothimi {
    @Override
    public void hi() {
        System.out.println("Hi Sanothimi");
    }
}

public class d_abstract {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.hi();
        s1.hello();
    }
}
