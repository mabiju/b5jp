package t_final_keyword;

// final class SuperClass {
class SuperClass {
    void hi() {
        System.out.println("Hi Students I'm super class.");
    }
}

class SubClass extends SuperClass {
    void hello() {
        System.out.println("Hello Students I'm sub class.");
    }
}

public class b_final_class {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.hi();
        obj.hello();
    }
}
