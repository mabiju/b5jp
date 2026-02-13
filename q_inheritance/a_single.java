package q_inheritance;

class SuperClass{
    void hi(){
        System.out.println("Hi from SuperClass");
    }
}

class SubClass extends SuperClass{
    void hello(){
        System.out.println("Hello from SubClass");
    }
}

public class a_single {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.hello(); // own method of SubClass
        obj.hi(); // accessing method of SuperClass
    }
}
