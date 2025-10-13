class Area {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double calculateArea(double l, double b) {
        return l * b;
    }
    public static int calculateArea(int s) {
        return s * s;
    }
    public static void main(String[] args) {
        if (args.length == 1) {
            int s = Integer.parseInt(args[0]);
            System.out.println("Square Area = " + calculateArea(s));
        }
        else if (args.length == 2 && args[0].equalsIgnoreCase("circle")) {
            double r = Double.parseDouble(args[1]);
            System.out.println("Area of circle = " + calculateArea(r));
        }

        else if (args.length == 2) {
            double l = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            System.out.println("Area of rectangle = " + calculateArea(l, b));
        }
        else {
            System.out.println("Usage");
            System.out.println(" java Area <side>             (Square)");
            System.out.println(" java Area <length> <breadth> (Rectangle)");
            System.out.println("  java Area circle <radius>    (Circle)");
        }
    }
}
