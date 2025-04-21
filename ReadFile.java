import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/gayathripamarthi/IOOperations/FileHandling.java/MyFavourites.txt");
        // File file1 = new File(path);
        // FileReader fr = new FileReader(file1);
        // int s = fr.read();
        // while (s != -1) {
        // System.out.print((char) s);
        // s = fr.read();
        // }
        // fr.close();

        // Scanner sc = new Scanner(file1);
        // while (sc.hasNext()) {
        // System.out.println(sc.nextLine());
        // }
        // sc.close();
        Files.writeString(path, "Hi!!!!! you are there", StandardOpenOption.APPEND);
        String x = Files.readString(path);
        System.out.println(x);

    }
}
