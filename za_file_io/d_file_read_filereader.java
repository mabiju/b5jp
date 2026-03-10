package za_file_io;

import java.io.FileReader;
import java.io.IOException;

public class d_file_read_filereader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/B5_JP/za_file_io/ram.txt");
        int a;

        while ((a = fr.read()) != -1) {
            System.out.print((char) a);
        }
        fr.close();
    }
}
