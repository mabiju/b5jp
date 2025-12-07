// widening type casting(explicit type conversion)
package g_type_conversion;

public class a_int_to_double {
    public static void main(String[] args) {
        int num_int = 89;
        System.out.println("The integer value is =" + num_int);
        double num_double = (double) num_int;
        System.out.println("The double value = " + num_double);
        System.out.println(((Object)num_int).getClass().getSimpleName()); // checking numeric data types
        System.out.println(((Object)num_double).getClass().getSimpleName());
    }
}
