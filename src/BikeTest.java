class MotorBike {
    void run() {
        System.out.println("Bike is running");
    }
}
class Splendor extends MotorBike {
    @Override
    void run() {
        System.out.println("Splendor is running safely at 60km/hr");
    }
}
public class BikeTest {
    public static void main(String[] args) {
        MotorBike obj = new Splendor();
        obj.run();
    }
}
