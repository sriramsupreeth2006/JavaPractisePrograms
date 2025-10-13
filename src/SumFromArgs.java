import java.util.Scanner;
public class SumFromArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in the array: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        int sum = 0;
        System.out.println("Numbers entered:");
        for (String p : parts) {
            int num = Integer.parseInt(p);
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nSum of all values = " + sum);
    }
}
