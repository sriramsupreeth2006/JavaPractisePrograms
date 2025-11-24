interface AlphaShape {
    void draw();
}
class OmegaCircle implements AlphaShape {
    public void draw() { System.out.println("Drawing Circle"); }
}
class ZetaRectangle implements AlphaShape {
    public void draw() { System.out.println("Drawing Rectangle"); }
}
class PhiFactory {
    public AlphaShape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle": return new OmegaCircle();
            case "rectangle": return new ZetaRectangle();
            default: throw new IllegalArgumentException("Invalid shape: " + type);
        }
    }
}
public class FactoryMain {
    public static void main(String[] args) {
        PhiFactory factory = new PhiFactory();
        AlphaShape c = factory.createShape("circle");
        AlphaShape r = factory.createShape("rectangle");
        c.draw();
        r.draw();
    }
}
