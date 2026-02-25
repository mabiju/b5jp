package z_console_io;

import java.io.Console;

public class f_console_string {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your college name:");
        String clzName = c.readLine();
        System.out.println("You're studying in " + clzName + " college.");
    }
}
