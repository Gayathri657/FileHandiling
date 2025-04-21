import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReadingFileWithOutLoops {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path of the file: ");
            String s = br.readLine();
            Path path = Path.of(s);
            // List<String> list = Collections.emptyList();
            // list = Files.readAllLines(path);
            // System.out.println("Some Exception");
            // for (String l : list) {
            // System.out.println(l);
            // }
            String data = Files.readString(path);
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

    }
}
