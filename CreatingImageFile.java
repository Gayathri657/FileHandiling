import java.io.*;

public class CreatingImageFile {
    public static void main(String[] args) throws IOException {
        String sourcePath = "/Users/gayathripamarthi/Downloads/a-z-about-reading-2.jpg";
        String destinationPath = "/Users/gayathripamarthi/IOOperations/FileHandling.java/GayathriImage.png";

        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destinationPath);

        byte[] buffer = new byte[1024]; // buffer size
        int bytesRead;

        // Read from source and write to destination
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        // Close streams
        fis.close();
        fos.close();

        System.out.println("Image copied successfully!");
    }
}
