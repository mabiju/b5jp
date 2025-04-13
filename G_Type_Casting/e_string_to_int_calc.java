package g_type_casting;

public class e_string_to_int_calc {
    public static void main(String[] args) {
        int num_val = 456;
        String string_val = "123";
        int string_num = Integer.parseInt(string_val);
        int sum = num_val + string_num;
        System.out.println("The sum = " + sum);
    }
}
