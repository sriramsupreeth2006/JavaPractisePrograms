import java.io.*;
public class CuboidVolumeDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\input.txt")
            );
            double length = Double.parseDouble(br.readLine());
            double breadth = Double.parseDouble(br.readLine());
            double height = Double.parseDouble(br.readLine());
            br.close();
            double volume = length * breadth * height;
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\output.txt")
            );
            bw.write("Volume of Cuboid: " + volume);
            bw.close();
            System.out.println("Volume calculated and written to output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in input file.");
        } catch (IOException e) {
            System.out.println("Error while processing the file.");
        }
    }
}
