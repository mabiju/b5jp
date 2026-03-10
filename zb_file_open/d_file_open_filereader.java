package zb_file_open;

import java.io.*;

public class d_file_open_filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/B5_JP/zb_file_open/sanothimi.txt");
            System.out.println("Content is:");

            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i); //prints the content of the file   
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
