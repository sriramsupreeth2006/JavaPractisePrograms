class Monster {
    String name;
    public Monster(String name) {
        this.name = name;
    }
    public String attack() {
        return "No attack is specified";
    }
}
class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return name + " attacks with fire!";
    }
}
class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return name + " attacks with water!";
    }
}
class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return name + " attacks with stones!";
    }
}
public class DemoMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Dragon");
        Monster m2 = new WaterMonster("Kraken");
        Monster m3 = new StoneMonster("Makara");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
    }
}