class Cycle {
    void define_me() {
        System.out.println("a vehicle with pedals");
    }
}
class Motorcycle extends Cycle {
    @Override
    void define_me() {
        System.out.println("a cycle with an engine");
    }
    Motorcycle() {
        System.out.println("Hello I am a motorcyle, I am a cycle with an engine.");
        System.out.print("My ancestor is a cycle who is ");
        super.define_me();
    }
}
public class MotorcycleMain {
    public static void main(String[] args) {
        Motorcycle mc = new Motorcycle();
    }
}