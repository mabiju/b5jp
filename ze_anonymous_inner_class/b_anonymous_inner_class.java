package ze_anonymous_inner_class;

public class b_anonymous_inner_class {
    interface Greeting {
        void greet();
    }

    public static void main(String[] args) {
        // Creating an instance of the interface using an anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, this is an anonymous inner class!");
            }
        };

        // Calling the method defined in the interface using the instance
        greeting.greet();
    }
}

