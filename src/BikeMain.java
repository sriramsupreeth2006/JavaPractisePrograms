class Bike {
    void run() {
        System.out.println("Bike is running....");
    }
}
class Apache extends Bike {
    @Override
    void run() {
        System.out.println("Apache is running at a higher speed of 100kmph...");
    }
}
public class BikeMain {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
        Apache a = new Apache();
        a.run();
        Bike poly = new Apache();
        poly.run();
    }
}