package g_type_casting;

public class d_string_to_int {
    public static void main(String[] args) {
        String stringNum = "78";
        System.out.println("The value of string num = " + stringNum);
        int string_int = Integer.parseInt(stringNum);
        System.out.println("The integer value = " + string_int);
        int checkNum = 89;
        System.out.println("The sum = " + (string_int + checkNum));
    }
}
