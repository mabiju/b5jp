package d_control_statements.d_jump;

public class d_continue_while {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 10) {
            num++;
            if (num == 7) {
                continue;
            }
            System.out.println(num);
        }
    }
}