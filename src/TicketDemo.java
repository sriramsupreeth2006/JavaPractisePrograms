import java.util.Scanner;
class Ticket {
    int ticketID;
    int noOfSeats;
    String date;
    double fare;
    static int totalSeatsBooked = 0;
    static int totalTicketsBooked = 0;
    Ticket(int ticketID, int noOfSeats, String date, double fare) {
        this.ticketID = ticketID;
        this.noOfSeats = noOfSeats;
        this.date = date;
        this.fare = fare;
        totalSeatsBooked += noOfSeats;
        totalTicketsBooked++;
    }
    void displayDetails() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Date: " + date);
        System.out.println("Seats: " + noOfSeats);
        System.out.println("Total Fare: " + fare);
    }
}
public class TicketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tickets to book: ");
        int n = sc.nextInt();
        sc.nextLine();
        Ticket[] tickets = new Ticket[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Ticket " + (i + 1));
            System.out.print("Ticket ID: ");
            int id = sc.nextInt();
            System.out.print("Number of seats: ");
            int seats = sc.nextInt();
            sc.nextLine();
            System.out.print("Date of booking(dd-mm-yyyy): ");
            String date = sc.nextLine();
            System.out.print("Fare: ");
            double fare = sc.nextDouble();
            sc.nextLine();
            tickets[i] = new Ticket(id, seats, date, fare);
        }
        for (Ticket t : tickets) {
            t.displayDetails();
        }
        System.out.println("Total Tickets Booked: " + Ticket.totalTicketsBooked);
        System.out.println("Total Seats Booked: " + Ticket.totalSeatsBooked);
    }
}
