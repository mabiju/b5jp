package z_console_io;

public class g_console_sum_two_nums {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        String stra = System.console().readLine();
        int a = Integer.parseInt(stra);
        System.out.println("Enter another number :");
        String strb = System.console().readLine();
        int b = Integer.parseInt(strb);
        System.out.println("The sum = " + (a + b));
    }
}
