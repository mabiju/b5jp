package t_final_keyword;

class Dad {
    // overridden method
    // final void cooking() {
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
public class c_final_method {
    public static void main(String[] args) {
        Daughter keti = new Daughter();
        keti.cooking();
    }
}
