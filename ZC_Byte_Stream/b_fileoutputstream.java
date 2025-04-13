package zc_byte_stream;

import java.io.FileOutputStream;

public class b_fileoutputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/SCJPB5/ZC_Byte_Stream/sita.txt");
            String s = "Hello Good morning class";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
