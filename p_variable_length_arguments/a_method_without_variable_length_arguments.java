package p_variable_length_arguments;

public class a_method_without_variable_length_arguments {
    public int add(int a) {
        return (a + a);
    }

    public int add(int a, int b) {
        return (a + b);
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        a_method_without_variable_length_arguments obj = new a_method_without_variable_length_arguments();
        System.out.println("The sum of two same integers = " + obj.add(10));
        System.out.println("The sum of two integers = " + obj.add(10, 20));
        System.out.println("The sum of three integers = " + obj.add(10, 20, 30));
    }
}
