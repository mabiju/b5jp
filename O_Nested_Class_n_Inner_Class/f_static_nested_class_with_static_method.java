package o_nested_class_n_inner_class;

public class f_static_nested_class_with_static_method {
    static int age = 25;

    // static nested class
    static class NestedClassTwo {
        static void display() {
            System.out.println("Age = " + age);
        }
    }

    public static void main(String[] args) {
        // no need to create the instance of static nested class
        f_static_nested_class_with_static_method.NestedClassTwo.display();
    }
}
