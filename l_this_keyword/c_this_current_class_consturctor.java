/* use of this keyword to invoke current class constructor calling
default constructor from parameterized constructor. */
package l_this_keyword;

class Nums{
    Nums()
    {
        System.out.println("Hello I'm default constructor.");
    }
    Nums(int a)
    {
        this();
        System.out.println("The value is = " + a);
    }
}

public class c_this_current_class_consturctor {
    public static void main(String[] args) {
        // Nums obj = new Nums(24);
        new Nums(24);
    }
}
