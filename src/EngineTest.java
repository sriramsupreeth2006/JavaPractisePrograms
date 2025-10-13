class Engine {
    private int engineID;
    private String engineType;
    private int horsepower;
    private float engineWeight;
    public Engine(int engineID, String engineType, int horsepower, float engineWeight) {
        setEngineID(engineID);
        setengineType(engineType);
        sethorsepower(horsepower);
        setengineWeight(engineWeight);
    }
    public void setEngineID(int engineID) {
        if (engineID <= 0)
            throw new IllegalArgumentException("Engine ID must be positive.");
            this.engineID = engineID;
    }
    public void setengineType(String engineType) {
        if (engineType == null || engineType.trim().isEmpty())
            throw new IllegalArgumentException("Engine type cannot be empty.");
        this.engineType = engineType;
    }
    public void sethorsepower(int horsepower) {
        if (horsepower <= 0) throw new IllegalArgumentException("Horsepower must be positive.");
        this.horsepower = horsepower;
    }
    public void setengineWeight(float engineWeight) {
        if (engineWeight <= 0) throw new IllegalArgumentException("Engine weight must be positive.");
        this.engineWeight = engineWeight;
    }
    @Override
    public String toString() {
        return "EngineID=" + engineID + ", Type=" + engineType +
                ", Horsepower=" + horsepower + ", Weight=" + engineWeight;
    }
}
public class EngineTest {
    public static void main(String[] args) {
        try {
            Engine e1 = new Engine(101, "Revotron", 118, 250);
            System.out.println("Engine 1 Details: " + e1);
            Engine e2 = new Engine(102, "Kappa", 81, 185);
            System.out.println("Engine 2 Details: " + e2);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}