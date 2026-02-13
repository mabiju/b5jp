package n_static_fields_method;

public class c_static_field_method {
    // instance field
    int a = 89;

    // static field
    static int b = 90;

    // instance method
    void displayInstanceMethod() {
        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
    }

    // static method
    static void displayStaticMethod()
    {
        // System.out.println("The value of a = " + a); // error
        System.out.println("The value of b = " + b);
    }

    public static void main(String[] args) {
        c_static_field_method obj = new c_static_field_method();
        obj.displayInstanceMethod();
        displayStaticMethod();
    }
}
