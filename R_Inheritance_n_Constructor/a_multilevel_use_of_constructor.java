package r_inheritance_n_constructor;

class GrandDad {
    GrandDad() {
        System.out.println("Calling default constructor from GrandDad class");
    }

    GrandDad(int x) {
        System.out.println("Calling parameterized constructor from GrandDad class with value of x = " + x);
    }
}

class Dad extends GrandDad {
    Dad() {
        System.out.println("Calling default constructor from Dad class");
    }

    Dad(int x, int y) {
        super(x);
        System.out.println("Calling parameterized constructor from Dad class with value of x = " + x + " and y = " + y);
    }
}

class Son extends Dad {
    Son() {
        System.out.println("Calling default constructor from Son class");
    }

    Son(int x, int y, int z) {
        super(x, y);
        System.out.println("Calling parameterized constructor from Son class with value of z = " + z);
    }
}

public class a_multilevel_use_of_constructor {
    public static void main(String[] args) {
        // GrandDad gd1 = new GrandDad();
        // GrandDad gd2 = new GrandDad(10);

        // Dad d1 = new Dad();
        // Dad d2 = new Dad(10, 20);

        // Son s1 = new Son();
        // Son s2 = new Son(10, 20, 30);

        new Son();
        new Son(10, 20, 30);
    }
}
