import java.io.*;
import java.util.*;

public class MergeStudentData {

    public static void main(String[] args) {
        try {

            String studPath = "D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\input.txt";
            String detailsPath = "D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\output.txt";

            // Print the paths being used
            System.out.println("Reading input.txt from: " + studPath);
            System.out.println("Reading output.txt from: " + detailsPath);

            // Also print working directory
            System.out.println("Java is running in directory: " + new File("").getAbsolutePath());

            BufferedReader studReader = new BufferedReader(new FileReader(studPath));
            BufferedReader detailsReader = new BufferedReader(new FileReader(detailsPath));

            String studLine, detailLine;

            System.out.println("\n--- Output ---");

            while ((studLine = studReader.readLine()) != null &&
                    (detailLine = detailsReader.readLine()) != null) {

                String studParts[] = studLine.split(" ");
                String detailParts[] = detailLine.split(" ");

                String id1 = studParts[0];
                String name = studParts[1];

                String id2 = detailParts[0];
                String address = detailParts[2];

                if (id1.equals(id2)) {
                    System.out.println(id1 + ": " + name + ": " + address);
                }
            }

            studReader.close();
            detailsReader.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
