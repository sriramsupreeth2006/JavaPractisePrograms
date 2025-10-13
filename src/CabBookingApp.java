package cabbooking;
public class CabBookingApp {
    public static void main(String[] args) {
        Passenger p1 = new Passenger();
        p1.setName("Swetha");
        p1.setMobile("7798765432");
        p1.setDistance(45);
        p1.computeFare();
        System.out.println(p1.toString());
    }
}