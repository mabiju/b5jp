package za_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class f_file_read_bufferedreader {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/B5_JP/za_file_io/ram.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        br.close();
    }
}
