package za_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class b_file_writer {
    public static void main(String[] args) throws IOException {
        String str = "Kata hideko ghanti bajayara... balen dai jindabad.";
        FileWriter fw = new FileWriter("D:/B5_JP/za_file_io/ram.txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println("Data updated successfully.");
        fw.close();
    }
}
