class ShapeGeometric {
    protected String borderColor;
    protected boolean filled;
    public ShapeGeometric(String borderColor, boolean filled) {
        this.borderColor = borderColor;
        this.filled = filled;
    }
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getBorderColor() {
        return borderColor;
    }
    public boolean isFilled() {
        return filled;
    }
    @Override
    public String toString() {
        return "GeometricShape [BorderColor=" + borderColor + ", Filled=" + filled + "]";
    }
}
class Rectangle extends ShapeGeometric {
    protected double length;
    protected double width;
    public Rectangle(String borderColor, boolean filled, double length, double width) {
        super(borderColor, filled);
        this.length = length;
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle [Length=" + length + ", Width=" + width +
                ", Area=" + getArea() + ", Perimeter=" + getPerimeter() +
                ", BorderColor=" + borderColor + ", Filled=" + filled + "]";
    }
}
public class GeometricShapeMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Red", true, 10.5, 5.5);
        System.out.println(rect);
        rect.setBorderColor("Red");
        rect.setFilled(false);
        rect.setLength(12.0);
        rect.setWidth(6.0);
        System.out.println(rect);
    }
}
