package za_file_io;

import java.io.File;
import java.io.IOException;

public class a_file_create {
    public static void main(String[] args) {
        File file = new File("D:/SCJPB5/ZA_File_IO/z_myfile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }
    }
}
