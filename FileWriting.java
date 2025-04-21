import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class FileWriting {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path of the file: ");
            String s = br.readLine();
            Path path = Path.of(s);
            Files.writeString(path, "Heyyyyyy!!!!!Hiiiii");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
