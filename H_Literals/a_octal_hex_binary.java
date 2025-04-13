package h_literals;

public class a_octal_hex_binary {
    public static void main(String[] args) {
        int num_decimal = 110;  // no prefix for decimal number
        int num_octal = 0110;   // octal - 0(Zero)
        int num_hex = 0xA2; // hexadecimal - 0x
        int num_binary = 0b110; // binary - 0b

        System.out.println("Decimal value : " + num_decimal);
        System.out.println("Octal value = " + num_octal);
        System.out.println("Hexadecimal value = " + num_hex);
        System.out.println("Binary value = " + num_binary);
    }
}
