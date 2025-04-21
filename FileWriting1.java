import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriting1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path of the file: ");
            String s = br.readLine();
            File file = new File(s);
            FileWriter fw = new FileWriter(file, true);
            fw.write("Not Giving up\n");
            fw.close();

        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
