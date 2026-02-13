package o_nested_class_n_inner_class;

abstract class Student {
    abstract void study();
}

public class d_anonymous_inner_class_using_class {
    public static void main(String[] args) {
        Student ram = new Student() {
            void study() {
                System.out.println("Ram is studying.......");
            }
        };
        ram.study();
    }
}
/*
 * A class is created, but its name is decided by the compiler, which extends
 * the Student class and provides the implementation of the study() method.
 * An object of the Anonymous class is created that is referred to by 'ram,' a
 * reference variable of Student type.
 */