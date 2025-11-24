abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }
    abstract void sound();
    void display() {
        System.out.println("Animal Name: " + name);
    }
}
class Cat extends Animal {
    Cat(String name) { super(name); }
    void sound() { System.out.println("Meow Meow"); }
}
class Dog extends Animal {
    Dog(String name) { super(name); }
    void sound() { System.out.println("Bark Bark"); }
}
public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Cat("Kitty");
        Animal a2 = new Dog("Bruno");
        a1.display();
        a1.sound();
        a2.display();
        a2.sound();
    }
}
