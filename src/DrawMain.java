interface Drawable {
    void draw();
}
class MyCircle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class MRectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class DrawMain {
    public static void main(String[] args) {
        Drawable c = new MyCircle();
        Drawable r = new MRectangle();
        c.draw();
        r.draw();
    }
}
