package e_operators;

public class g_bitwise_OR {
    public static void main(String[] args) {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101

        // Demo of Bitwise OR(|) Operator
        int c = a | b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0011 1101 (Bitwise OR (|) where False | False = False otherwise True)
         * 0011 1101 = 61(in Decimal)
         */

        System.out.println(c); // 61
    }
}
