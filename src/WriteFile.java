import java.io.FileWriter;
import java.io.IOException;
public class WriteFile
{
    public static void main(String[] args)
    {
        try {
            FileWriter Writer = new FileWriter("myfile_1.txt", true);
            Writer.write("Files in Java are seriously good!!\n");
            Writer.write("Java is faster in executing programs than Python.\n");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }     } }