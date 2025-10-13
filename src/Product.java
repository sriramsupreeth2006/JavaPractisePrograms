public class Product {
    int id;
    String name;
    int quantity;
    double price;
    public Product() {
        this.id = 0;
        this.name = "Unknown";
        this.quantity = 0;
        this.price = 0.0;
    }
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public Product(Product other) {
        this.id = other.id;
        this.name = other.name;
        this.quantity = other.quantity;
        this.price = other.price;
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Mobile Stand", 2, 398);
        Product p3 = new Product(102, "32GB Pendrive", 1, 599.99);
        Product p4 = new Product(p2);
        System.out.println("Product 1 (Default): ");
        p1.display();
        System.out.println("Product 2 (Parameterized): ");
        p2.display();
        System.out.println("Product 3 (Parameterized): ");
        p3.display();
        System.out.println("Product 4 (Copy): ");
        p4.display();
    }
}