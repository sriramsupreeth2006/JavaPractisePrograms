import java.util.Scanner;
public class Account {
    static String name;
    static String cardNumber;
    static int pin;
    public static void accountDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("PIN        : " + pin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter the Card Number: ");
        cardNumber = sc.nextLine();
        System.out.print("Enter PIN: ");
        pin = sc.nextInt();
        accountDetails();
    }
}