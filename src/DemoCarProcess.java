import java.util.*;
class CarEngine {
    int engineID, horsepower;
    String engineType;
    float engineWeight;
    CarEngine(int id, String type, int hp, float wt) {
        engineID = id; engineType = type; horsepower = hp; engineWeight = wt;
    }
    public String toString() {
        return engineID + " | " + engineType + " | " + horsepower + " HP | " + engineWeight + " kg";
    }
}
class Car {
    String reg, make, model, color;
    int year;
    CarEngine eng;
    Car(String r, String mk, String md, int y, String c, CarEngine e) {
        reg = r; make = mk; model = md; year = y; color = c; eng = e;
    }
    public String toString() {
        return "\n" + reg + " | " + make + " | " + model + " | " + year + " | " + color +
                "\nEngine: " + eng;
    }
}
class ShowRoom {
    Car[] cars = new Car[50];
    static int noOfCars = 0;
    void addCar(Car c) { cars[noOfCars++] = c; }
    void updateCar(String reg, Scanner sc) {
        for (int i = 0; i < noOfCars; i++) {
            if (cars[i].reg.equals(reg)) {
                System.out.print("New Color: ");
                cars[i].color = sc.nextLine();
                System.out.print("New Year: ");
                cars[i].year = Integer.parseInt(sc.nextLine());
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Car Not Found!");
    }
    void displayAll() {
        if (noOfCars == 0) { System.out.println("No cars."); return; }
        for (int i = 0; i < noOfCars; i++) System.out.println(cars[i]);
    }
    void displayByModel(String m) {
        boolean found = false;
        for (int i = 0; i < noOfCars; i++)
            if (cars[i].model.equalsIgnoreCase(m)) {
                System.out.println(cars[i]);
                found = true;
            }
        if (!found) System.out.println("No car with model: " + m);
    }
}
public class DemoCarProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowRoom sr = new ShowRoom();
        while (true) {
            System.out.println("\n1.Add  2.Update  3.Display All  4.Display By Model  5.Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sc.nextLine());   // SAFEST FORM
            switch (choice) {
                case 1:
                    System.out.print("Reg: ");
                    String r = sc.nextLine();
                    System.out.print("Make: ");
                    String mk = sc.nextLine();
                    System.out.print("Model: ");
                    String md = sc.nextLine();
                    System.out.print("Year: ");
                    int y = Integer.parseInt(sc.nextLine());
                    System.out.print("Color: ");
                    String c = sc.nextLine();
                    System.out.print("EngineID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Engine Type: ");
                    String type = sc.nextLine();
                    System.out.print("HP: ");
                    int hp = Integer.parseInt(sc.nextLine());
                    System.out.print("Weight: ");
                    float wt = Float.parseFloat(sc.nextLine());
                    CarEngine e = new CarEngine(id, type, hp, wt);
                    sr.addCar(new Car(r, mk, md, y, c, e));
                    break;
                case 2:
                    System.out.print("Reg to update: ");
                    String reg = sc.nextLine();
                    sr.updateCar(reg, sc);
                    break;
                case 3:
                    sr.displayAll();
                    break;
                case 4:
                    System.out.print("Model: ");
                    String model = sc.nextLine();
                    sr.displayByModel(model);
                    break;

                case 5:
                    return;
            }
        }
    }
}
