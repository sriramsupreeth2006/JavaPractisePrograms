import java.io.*;

public class ShapeMain {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\input.txt")
            );
            int length = Integer.parseInt(br.readLine());
            int breadth = Integer.parseInt(br.readLine());
            int height = Integer.parseInt(br.readLine());
            br.close();
            int surfaceArea = 2 * (length * breadth + breadth * height + height * length);
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\output.txt"));
            bw.write("Surface Area of Cuboid: " + surfaceArea);
            bw.close();
            System.out.println("Surface area calculated and written to output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the input file.");
        } catch (IOException e) {
            System.out.println("Error occurred while processing the file.");
        }
    }
}
