// use of this keyword to return current class instance
package l_this_keyword;

class Bus {
    Bus hi() {
        return this;
    }

    void hello() {
        System.out.println("Hello Sanothimi");
    }
}

public class h_this_return_current_class_instance {
    public static void main(String[] args) {
        new Bus().hi().hello();
    }
}

