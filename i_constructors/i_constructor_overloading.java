package i_constructors;

public class i_constructor_overloading {
    public i_constructor_overloading() {
        System.out.println("Hello I'm default constructor.");
    }

    public i_constructor_overloading(int a) {
        System.out.println("Square of " + a + " = " + (a * a));
    }

    public i_constructor_overloading(double b) {
        System.out.println("Hello I'm double value equals to " + b);
    }

    public i_constructor_overloading(int a, String b) {
        System.out.println("My name is " + b + " and roll number = " + a);
    }

    public static void main(String[] args) {
        /*
         * i_constructor_overloading obj1 = new i_constructor_overloading();
         * i_constructor_overloading obj2 = new i_constructor_overloading(2);
         * i_constructor_overloading obj3 = new i_constructor_overloading(22.4);
         * i_constructor_overloading obj4 = new i_constructor_overloading(420, "Ram");
         */

        new i_constructor_overloading();
        new i_constructor_overloading(2);
        new i_constructor_overloading(22.4);
        new i_constructor_overloading(420, "Ram");
    }
}
