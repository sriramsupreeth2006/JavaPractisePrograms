class BikeCycle {
    void print() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class Motcycle extends BikeCycle {
    void print() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.print();
    }
}
public class BikeSolution {
    public static void main(String[] args) {
        Motcycle m = new Motcycle();
        m.print();
    }
}
