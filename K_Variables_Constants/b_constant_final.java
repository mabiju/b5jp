package K_Variables_Constants;

class College {
    final int clzID = 27;

    void display() {
        System.out.println("College ID = " + clzID);
    }
}

public class b_constant_final {
    public static void main(String[] args) {
        College stc = new College();
        stc.display();
    }
}
