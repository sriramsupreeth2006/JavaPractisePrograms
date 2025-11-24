abstract class WarPreparation {
    public final void prepareForWar() {
        gatherTroops();
        fortifyDefenses();
        planStrategy();
        System.out.println();
    }
    abstract void gatherTroops();
    abstract void fortifyDefenses();
    abstract void planStrategy();
}
class HumanWarPrep extends WarPreparation {
    void gatherTroops() { System.out.println("Humans: Gathering knights and archers."); }
    void fortifyDefenses() { System.out.println("Humans: Strengthening castles and walls."); }
    void planStrategy() { System.out.println("Humans: Forming battle formations and siege plans."); }
}
class ElfWarPrep extends WarPreparation {
    void gatherTroops() { System.out.println("Elves: Summoning elite archers and magical warriors."); }
    void fortifyDefenses() { System.out.println("Elves: Enchanting forests and building hidden barriers."); }
    void planStrategy() { System.out.println("Elves: Crafting stealth and long-range attack plans."); }
}
class DwarfWarPrep extends WarPreparation {
    void gatherTroops() { System.out.println("Dwarves: Rallying axe-wielders and armored guards."); }
    void fortifyDefenses() { System.out.println("Dwarves: Reinforcing mountain strongholds."); }
    void planStrategy() { System.out.println("Dwarves: Planning close-combat and underground assaults."); }
}
public class MiddleEarthWarDemo {
    public static void main(String[] args) {
        WarPreparation human = new HumanWarPrep();
        WarPreparation elf = new ElfWarPrep();
        WarPreparation dwarf = new DwarfWarPrep();
        human.prepareForWar();
        elf.prepareForWar();
        dwarf.prepareForWar();
    }
}
