import java.io.*;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path of the file : ");
        String path = br.readLine();
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String s = bf.readLine();
        while (s != null) {
            System.out.println(s);
            s = bf.readLine();
        }
        bf.close();

    }
}