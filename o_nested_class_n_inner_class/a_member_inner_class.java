package o_nested_class_n_inner_class;

// outer class
public class a_member_inner_class {
    String clzName = "Sanothimi";

    // inner class
    class InnerOne {
        void display() {
            System.out.println("College name = " + clzName);
        }
    }

    public static void main(String[] args) {
        a_member_inner_class obj = new a_member_inner_class();
        a_member_inner_class.InnerOne inObj = obj.new InnerOne();
        inObj.display();
    }
}
