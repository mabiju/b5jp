// narrowing type casting(explicit type conversion)
package g_type_conversion;

public class b_double_to_int {
    public static void main(String[] args) {
        double num_double = 12.345;
        System.out.println("The double value is = " + num_double);
        int num_int = (int) num_double;
        System.out.println("The integer value = " + num_int);
    }
}
