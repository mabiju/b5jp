package z_console_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class k_bufferedreader_string {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name :");
        String name = reader.readLine();
        System.out.println("Your name is = " + name);
    }
}
