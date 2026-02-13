package w_access_specifier;

class Calc {
    protected int sum(int a, int b) {
        return (a + b);
    }
}

/*
 * public class c_access_specifier_protected {
 * public static void main(String[] args) {
 * Calc c1 = new Calc();
 * System.out.println("The sum = " + c1.sum(12, 45));
 * }
 * }
 */

public class c_access_specifier_protected extends Calc {
    public static void main(String[] args) {
        c_access_specifier_protected c1 = new c_access_specifier_protected();
        System.out.println("The sum = " + c1.sum(12, 45));
    }
}
