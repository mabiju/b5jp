package z_console_io;

public class e_console_string {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        String name = System.console().readLine();
        System.out.println("Your name is " + name);
    }
}
