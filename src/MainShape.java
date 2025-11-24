import java.util.*;
abstract class Shape {
    double area;
    abstract void calculateArea();
    void displayArea() {
        System.out.println("Area: " + area);
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}
class SRectangle extends Shape {
    double length, breadth;
    SRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        area = length * breadth;
    }
}
class MainShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.calculateArea();
        c.displayArea();
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        SRectangle rect = new SRectangle(l, b);
        rect.calculateArea();
        rect.displayArea();
    }
}
