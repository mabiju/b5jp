package za_file_io;

import java.io.File;
import java.io.IOException;

public class a_file_create {
    public static void main(String[] args) {
        File file = new File("D:/B5_JP/za_file_io/sita.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File Created Successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }
    }
}
