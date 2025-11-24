import java.io.*;
public class FileReadExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            System.out.println("Trying to read from file: data.txt");
            fis = new FileInputStream("data.txt");
            int ch;
            System.out.println("File Contents:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error while reading file");
        }
        finally {
            try {
                if (fis != null)
                    fis.close();
            }
            catch (IOException e) {
                System.out.println("Error while closing file");
            }
            System.out.println("\nFinished Reading");
        }
    }
}
