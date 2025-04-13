package s_polymorphism.ii_method_overriding;

class Dad {
    // overridden method
    void cooking() {
        System.out.println("Dad is preparing meal.");
    }
}

class Daughter extends Dad {
    @Override
    // overriding method
    void cooking() {
        System.out.println("Papa ki pari is preparing meal.");
    }
}

public class a_overriding {
    public static void main(String[] args) {
        Daughter keti = new Daughter();
        keti.cooking();
    }
}
