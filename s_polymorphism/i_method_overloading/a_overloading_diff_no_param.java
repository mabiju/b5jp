// demonstrating method overloading based on different number of parameters.
package s_polymorphism.i_method_overloading;

class Calc {
    public void display(int a) {
        System.out.println("The value of a = " + a);
    }

    public void display(int a, int b) {
        System.out.println("The value of a = " + a + " and b = " + b);
    }

    public void display(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class a_overloading_diff_no_param {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.display(10);
        obj.display(10, 20);
        obj.display(10, 20, 30);
    }
}
