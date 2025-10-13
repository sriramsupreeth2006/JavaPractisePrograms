class Number {
    public void show(int a) {
        System.out.println("Method with one integer: " + a);
    }
    public void show(int a, int b) {
        System.out.println("Method with two integers: " + a + " and " + b);
    }
}
public class MainMethod {
    public static void main(String[] args) {
        Number n = new Number();
        n.show(10);
        n.show(35, 88);
    }
}