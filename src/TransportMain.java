import java.util.*;
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    void printState();
}
class Bicycle implements Vehicle {
    int speed = 0, gear = 1;
    public void changeGear(int a) { gear = a; }
    public void speedUp(int a) { speed += a; }
    public void applyBrakes(int a) { speed -= a; }
    public void printState() {
        System.out.println("Bicycle -> Speed: " + speed + " Gear: " + gear);
    }
}
class MBike implements Vehicle {
    int speed = 0, gear = 1;
    public void changeGear(int a) { gear = a; }
    public void speedUp(int a) { speed += a; }
    public void applyBrakes(int a) { speed -= a; }
    public void printState() {
        System.out.println("Bike -> Speed: " + speed + " Gear: " + gear);
    }
}
class TransportMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bicycle b = new Bicycle();
        MBike m = new MBike();
        b.changeGear(sc.nextInt());
        b.speedUp(sc.nextInt());
        b.applyBrakes(sc.nextInt());
        m.changeGear(sc.nextInt());
        m.speedUp(sc.nextInt());
        m.applyBrakes(sc.nextInt());
        b.printState();
        m.printState();
    }
}
