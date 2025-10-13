class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {

}
public class MainAdder {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int output = adder.add(25, 47);
        System.out.println("Sum: " + output);
    }
}