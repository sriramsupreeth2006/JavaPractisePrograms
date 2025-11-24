abstract class Pizza {
    public final void preparePizza() {
        prepareBase();
        addToppings();
        bakePizza();
        System.out.println();
    }
    abstract void prepareBase();
    abstract void addToppings();
    abstract void bakePizza();
}
class VegPizza extends Pizza {
    void prepareBase() { System.out.println("Preparing wheat base for Veg Pizza"); }
    void addToppings() { System.out.println("Adding veggies and cheese"); }
    void bakePizza()  { System.out.println("Baking Veg Pizza at 180°C"); }
}
class ChickenPizza extends Pizza {
    void prepareBase() { System.out.println("Preparing thin crust base for Chicken Pizza"); }
    void addToppings() { System.out.println("Adding chicken, cheese and spices"); }
    void bakePizza()  { System.out.println("Baking Chicken Pizza at 200°C"); }
}
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Pizza veg = new VegPizza();
        Pizza chicken = new ChickenPizza();
        veg.preparePizza();
        chicken.preparePizza();
    }
}
