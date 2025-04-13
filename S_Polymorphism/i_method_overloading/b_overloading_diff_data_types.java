// demonstrating method overloading based on different data types on parameters.
package s_polymorphism.i_method_overloading;

class Nums {
    int add(int a, int b) {
        return (a + b);
    }

    double add(double a, double b) {
        return (a + b);
    }
}

public class b_overloading_diff_data_types {
    public static void main(String[] args) {
        Nums obj = new Nums();
        int sum1 = obj.add(12, 34);
        double sum2 = obj.add(23.45, 56.78);
        System.out.println("The sum of integers  = " + sum1);
        System.out.println("The sum of doubles  = " + sum2);
    }
}
