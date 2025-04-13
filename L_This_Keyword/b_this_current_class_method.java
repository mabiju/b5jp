// use of this keyword to invoke current class method
package l_this_keyword;

class Teacher{
    void hi()
    {
        System.out.println("Hi Sanothimi");
    }
    void hello()
    {
        this.hi(); // similar to access hi() method
        System.out.println("Hello Sanothimi");
    }
}

public class b_this_current_class_method {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.hello();
    }
}
