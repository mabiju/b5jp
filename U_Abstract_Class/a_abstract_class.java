package u_abstract_class;

abstract class Dad {
    abstract void hi();
}

class Son extends Dad {
    @Override
    void hi() {
        System.out.println("Hi from your son.");
    }
}

class Daughter extends Dad {
    @Override
    void hi() {
        System.out.println("Hi from your daughter.");
    }
}

public class a_abstract_class {
    public static void main(String[] args) {
        /* Son s1 = new Son();
        s1.hi();
        Daughter d1 = new Daughter();
        d1.hi(); */

        Dad d1 = new Son();
        Dad d2 = new Daughter();
        d1.hi();
        d2.hi();
    }
}
