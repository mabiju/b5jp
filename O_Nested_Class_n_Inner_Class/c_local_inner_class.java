package O_Nested_Class_n_Inner_Class;

public class c_local_inner_class {
    int clzId = 27;

    void displayClzId() {
        class InnerClassThree {
            void display() {
                System.out.println("College Id = " + clzId);
            }
        }
        InnerClassThree in = new InnerClassThree();
        in.display();
    }

    public static void main(String[] args) {
        c_local_inner_class out = new c_local_inner_class();
        out.displayClzId();
    }
}
