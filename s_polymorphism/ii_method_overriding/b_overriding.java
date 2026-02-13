package s_polymorphism.ii_method_overriding;

class GrandMa {
    void hello() {
        System.out.println("Hello from your GrandMa");
    }
}

class Ma extends GrandMa {
    void hello() {
        System.out.println("Hello from your Ma");
    }
}

class Child extends Ma {
    void hello() {
        System.out.println("Hello from your Child");
    }
}

public class b_overriding {
    public static void main(String[] args) {
        GrandMa a, b, c;
        a = new GrandMa();
        b = new Ma();
        c = new Child();

        a.hello();
        b.hello();
        c.hello();
    }
}
