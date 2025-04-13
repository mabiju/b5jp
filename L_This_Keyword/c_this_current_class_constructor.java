/* use of this keyword to invoke current class constructor
calling default constructor from parameterized constructor */
package l_this_keyword;

class Nums{
    Nums() {
        System.out.println("Hello I am default constructor.");
    }
    Nums(int a){
        this();
        System.out.println("The value is = " + a);
    }
}

public class c_this_current_class_constructor {
    public static void main(String[] args) {
        // Nums obj = new Nums(25);
        new Nums(25);
    }
}
