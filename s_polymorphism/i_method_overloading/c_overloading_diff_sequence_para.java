// demonstrating method overloading based on different sequence of parameters.
package s_polymorphism.i_method_overloading;

class SumDemo {
    void add(int a, double b) {
        System.out.println("The sum = " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("The sum = " + (a + b));
    }
}

public class c_overloading_diff_sequence_para {
    public static void main(String[] args) {
        SumDemo obj = new SumDemo();
        obj.add(12, 45.67);
        obj.add(23.45, 67);
    }
}
