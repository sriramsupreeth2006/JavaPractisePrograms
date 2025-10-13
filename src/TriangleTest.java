import java.util.Scanner;
class GeometricShape {
    String color = "White";
    boolean filled = false;
    public GeometricShape() {}
    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
class Triangle extends GeometricShape {
    double side1 = 2.0;
    double side2 = 2.0;
    double side3 = 2.0;
    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea() {
        double s = getPerimeter()  / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = sc.nextDouble();
        System.out.print("Enter color: ");
        String color = sc.next();
        System.out.print("Is triangle filled? (true/false): ");
        boolean filled = sc.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("\n" + triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}