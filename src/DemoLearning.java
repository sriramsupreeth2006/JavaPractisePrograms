abstract class LearningTemplate {
    public final void learn() {
        defineGoals();
        allocateTime();
        gatherResources();
        activelyEngage();
        if (celebrateAchievement()) System.out.println("Celebrate!");
        System.out.println();
    }
    abstract void defineGoals();
    abstract void allocateTime();
    abstract void gatherResources();
    abstract void activelyEngage();
    boolean celebrateAchievement() { return false; }
}
class ProfessionalDevelopment extends LearningTemplate {
    void defineGoals() { System.out.println("Goal: Certification"); }
    void allocateTime() { System.out.println("Time: 3 hrs/day"); }
    void gatherResources() { System.out.println("Resources: Books & Tests"); }
    void activelyEngage() { System.out.println("Engage: Practice coding"); }
    boolean celebrateAchievement() { return true; }
}
class PersonalLearning extends LearningTemplate {
    void defineGoals() { System.out.println("Goal: Cricket"); }
    void allocateTime() { System.out.println("Time: 30 mins/day"); }
    void gatherResources() { System.out.println("Resources: Tutorials"); }
    void activelyEngage() { System.out.println("Engage: Practice various shots"); }
}
public class DemoLearning {
    public static void main(String[] args) {
        new ProfessionalDevelopment().learn();
        new PersonalLearning().learn();
    }
}
