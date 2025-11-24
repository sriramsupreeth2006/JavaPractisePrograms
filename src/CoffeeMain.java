interface Coffee {
    double cost();
    String description();
}
class SimpleCoffee implements Coffee {
    public double cost() { return 50; }
    public String description() { return "Simple Coffee"; }
}
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    CoffeeDecorator(Coffee c) { this.coffee = c; }
}
class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee c) { super(c); }
    public double cost() { return coffee.cost() + 10; }
    public String description() { return coffee.description() + ", Milk"; }
}
class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee c) { super(c); }
    public double cost() { return coffee.cost() + 5; }
    public String description() { return coffee.description() + ", Sugar"; }
}
class CoffeeOrder {
    public Coffee addMilk(Coffee c) { return new MilkDecorator(c); }
    public Coffee addSugar(Coffee c) { return new SugarDecorator(c); }
}
public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder();
        Coffee c1 = new SimpleCoffee();
        Coffee c2 = order.addMilk(new SimpleCoffee());
        Coffee c3 = order.addSugar(order.addMilk(new SimpleCoffee()));
        System.out.println(c1.description() + " → ₹" + c1.cost());
        System.out.println(c2.description() + " → ₹" + c2.cost());
        System.out.println(c3.description() + " → ₹" + c3.cost());
    }
}
