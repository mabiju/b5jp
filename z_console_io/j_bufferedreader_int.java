package z_console_io;

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; */

import java.io.*;

public class j_bufferedreader_int {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number :");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The value you entered is = " + num);
    }
}
