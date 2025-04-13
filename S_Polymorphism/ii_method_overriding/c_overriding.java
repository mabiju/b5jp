package s_polymorphism.ii_method_overriding;

class Teacher {
    void study() {
        System.out.println("Teacher is studying....");
    }
}

public class c_overriding extends Teacher {
    void study() {
        System.out.println("Boy is running......");
    }

    public static void main(String[] args) {
        /*
         * Reference is of Teacher type and object is
         * c_overriding type
         */
        Teacher t1 = new c_overriding();
        /*
         * Reference is of Teacher type and object is
         * Teacher type
         */
        Teacher t2 = new Teacher();
        t1.study();
        t2.study();
    }
}
