import java.util.*;
abstract class BaseShape {
    protected int numSides;
    BaseShape(int numSides) {
        this.numSides = numSides;
    }
    int getNumSides() {
        return numSides;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
class MyRectangle extends BaseShape {
    double width, height;
    MyRectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
class MyRtTriangle extends BaseShape {
    double width, height;
    MyRtTriangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return 0.5 * width * height;
    }
    double getPerimeter() {
        double hyp = Math.sqrt(width * width + height * height);
        return width + height + hyp;
    }
}
public class ShMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        MyRectangle r = new MyRectangle(w1, h1);
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        MyRtTriangle t = new MyRtTriangle(w2, h2);
        System.out.println("Rectangle: Sides=" + r.getNumSides() +
                ", Area=" + r.getArea() + ", Perimeter=" + r.getPerimeter());
        System.out.println("Right Triangle: Sides=" + t.getNumSides() +
                ", Area=" + t.getArea() + ", Perimeter=" + t.getPerimeter());
    }
}
