package ZB_File_Open;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class f_file_open_java_nio_package {
    public static void main(String[] args) {
        Path path = Paths.get("D:/SCJPB5/ZB_File_Open/sanothimi.txt");
        try {
            byte[] bs = Files.readAllBytes(path);
            List<String> strings = Files.readAllLines(path);

            System.out.println("Read bytes = " + new String(bs));
            System.out.println("Read lines = " + strings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
