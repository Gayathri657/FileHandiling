import java.io.*;

class CreateRWD {
    public static void main(String[] args) throws IOException {
        String path = "/Users/gayathripamarthi/IOOperations/FileHandling.java/MyWorld.txt";
        FileOutputStream file1 = new FileOutputStream(path);
        OutputStreamWriter bw = new OutputStreamWriter(file1);
        file1.write(78);
        bw.write(65);
        bw.write("Hello");
        bw.close();
    }
}