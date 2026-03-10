package za_file_io;

import java.io.File;

public class n_file_size {
    public static void main(String[] args) {
        File file = new File("D:/B5_JP/za_file_io/ram.txt");
        long fileSize = file.length();
        // long filekb = fileLength/1024; // converting length in kilobytes
        System.out.println("The filesize = " + fileSize + " bytes");
    }
}