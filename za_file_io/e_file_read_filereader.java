package za_file_io;

/* import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; */

import java.io.*;

public class e_file_read_filereader {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("D:/B5_JP/za_file_io/ram.txt"); 
        } catch (FileNotFoundException fe) {
            System.out.println("File ta bhetiyana hai hajur ...." + fe);
        }
        while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
        }
        fr.close();
    }
}
