class InvalidEngineIDException extends Exception {
    public InvalidEngineIDException(String msg) {
        super(msg);
    }
}
class InvalidEngineTypeException extends Exception {
    public InvalidEngineTypeException(String msg) {
        super(msg);
    }
}
class InvalidHorsePowerException extends Exception {
    public InvalidHorsePowerException(String msg) {
        super(msg);
    }
}
class InvalidEngineWeightException extends Exception {
    public InvalidEngineWeightException(String msg) {
        super(msg);
    }
}
class TransEngine {
    private int engineID;
    private String engineType;
    private int horsePower;
    private float engineWeight;
    public TransEngine() {}
    public TransEngine(int engineID, String engineType, int horsePower, float engineWeight)
            throws InvalidEngineIDException, InvalidEngineTypeException,
            InvalidHorsePowerException, InvalidEngineWeightException {
        setEngineID(engineID);
        setEngineType(engineType);
        setHorsePower(horsePower);
        setEngineWeight(engineWeight);
    }
    public void setEngineID(int engineID) throws InvalidEngineIDException {
        if (!String.valueOf(engineID).matches("\\d{5}"))
            throw new InvalidEngineIDException("Engine ID must be a 5-digit number.");
        this.engineID = engineID;
    }
    public void setEngineType(String engineType) throws InvalidEngineTypeException {
        if (engineType == null || engineType.length() != 8)
            throw new InvalidEngineTypeException("Engine Type must contain exactly 8 characters.");
        this.engineType = engineType;
    }
    public void setHorsePower(int horsePower) throws InvalidHorsePowerException {
        if (horsePower > 2000)
            throw new InvalidHorsePowerException("Horse Power must not exceed 2000 cc.");
        this.horsePower = horsePower;
    }
    public void setEngineWeight(float engineWeight) throws InvalidEngineWeightException {
        if (engineWeight > 500)
            throw new InvalidEngineWeightException("Engine Weight must not exceed 500 Kg.");
        this.engineWeight = engineWeight;
    }
    public int getEngineID() { return engineID; }
    public String getEngineType() { return engineType; }
    public int getHorsePower() { return horsePower; }
    public float getEngineWeight() { return engineWeight; }
    @Override
    public String toString() {
        return "\nTransEngine Details:\n" +
                "Engine ID: " + engineID + "\n" +
                "Engine Type: " + engineType + "\n" +
                "Horse Power: " + horsePower + " cc\n" +
                "Engine Weight: " + engineWeight + " Kg\n";
    }
}
public class CarEngineMain {
    public static void main(String[] args) {
        try {
            TransEngine e1 = new TransEngine(12345, "TurboV12", 1800, 450.5f);
            System.out.println(e1);
            TransEngine e2 = new TransEngine(1234, "PowerAAA", 1500, 300);
            System.out.println(e2);
        } catch (Exception e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }
        System.out.println("\n--- Testing Invalid Values Individually ---");
        try {
            TransEngine e3 = new TransEngine();
            e3.setEngineType("SHORT");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            TransEngine e4 = new TransEngine();
            e4.setHorsePower(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            TransEngine e5 = new TransEngine();
            e5.setEngineWeight(520);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
