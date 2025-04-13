package zc_byte_stream;

import java.io.FileInputStream;

public class a_fileinputstream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/SCJPB5/ZC_Byte_Stream/ram.txt");
            System.out.println("Data in files = ");
            int ch = fis.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fis.read();
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
