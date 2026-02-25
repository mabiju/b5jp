package z_console_io;

import java.io.*;

public class i_console_password {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your password:");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Your password is = " + pass);
    }
}
