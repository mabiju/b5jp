package za_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class c_file_read_scanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:/B5_JP/za_file_io/ram.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
