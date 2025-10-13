import java.io.FileInputStream;
import java.io.IOException;
public class ByteStreamRead {
    public static void main(String[] args) {
        String path = "D:\\Personal Files\\Generated Image August 27, 2025 - 12_46PM.jpeg";
        try (FileInputStream fin = new FileInputStream(path)) {
            int byteData;
            while ((byteData = fin.read()) != -1) {
                System.out.print(byteData + " ");
            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println("I / O Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}