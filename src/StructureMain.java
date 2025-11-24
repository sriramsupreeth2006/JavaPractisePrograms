import java.util.*;
abstract class Point {
    protected int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
    abstract void show();
}
class Line extends Point {
    int x2, y2;
    Line(int x, int y, int x2, int y2) { super(x,y); this.x2=x2; this.y2=y2; }
    void show() { System.out.println("Line: ("+x+","+y+") to ("+x2+","+y2+")"); }
}
class SCircle extends Point {
    int r;
    SCircle(int x, int y, int r) { super(x,y); this.r=r; }
    void show() { System.out.println("Circle: Center("+x+","+y+"), r="+r); }
}
class StrRectangle extends Point {
    int x2, y2;
    StrRectangle(int x, int y, int x2, int y2) { super(x,y); this.x2=x2; this.y2=y2; }
    void show() { System.out.println("Rectangle: ("+x+","+y+") to ("+x2+","+y2+")"); }
}
public class StructureMain {
    public static void main(String[] args) {
        Random r = new Random();
        Point[] arr = new Point[10];
        for(int i=0;i<10;i++){
            int t = r.nextInt(3);
            arr[i] = (t==0) ? new Line(r.nextInt(50),r.nextInt(50),r.nextInt(50),r.nextInt(50)) :
                    (t==1) ? new SCircle(r.nextInt(50),r.nextInt(50),r.nextInt(20)+1) :
                            new StrRectangle(r.nextInt(50),r.nextInt(50),r.nextInt(50),r.nextInt(50));
        }
        for(Point p : arr) p.show();
    }
}
