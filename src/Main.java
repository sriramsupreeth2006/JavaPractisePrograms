public class Main {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(4, 9, 12);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(4));
        System.out.println(parkingSystem.addCar(9));
        System.out.println(parkingSystem.addCar(5));
    }
}