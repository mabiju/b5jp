package g_type_conversion;

public class e_double_to_string {
    public static void main(String[] args) {
        double num_double = 123.4567d;
        System.out.println("The double value is =" + num_double);
        String string_double = Double.toString(num_double);
        System.out.println("The string conversion of double value = " + string_double);
    }
}
