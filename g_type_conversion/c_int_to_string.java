package g_type_conversion;

public class c_int_to_string {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("The numeric value  = " + num);
        String numString = String.valueOf(num);
        System.out.println("The value of num string = " + numString);
        System.out.println(numString.getClass().getSimpleName()); // checking string data types
    }
}
