/* use of this keyword to invoke current class constructor
calling parameterized constructor from default constructor */
package l_this_keyword;

class Calc{
    Calc() {
        this(67);
        System.out.println("This is a default constructor.");
    }
    Calc(int a) {
        System.out.println("The value = " + a);
    }
}

public class d_this_current_class_constructor {
    public static void main(String[] args) {
        // Calc c = new Calc();
        new Calc();
    }
}
