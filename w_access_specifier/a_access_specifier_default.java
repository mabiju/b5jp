package w_access_specifier;

class Nums {
    // there is not any access specifier keywor used, i.e. default
    int a = 5;
}

public class a_access_specifier_default {
    public static void main(String[] args) {
        Nums obj = new Nums();
        System.out.println("The value = " + obj.a);
    }
}
