package cabbooking;
public class Passenger {
    private String name;
    private String mobile;
    private double distance;
    private double fare;
    public void setName(String name) {
        this.name = name;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setDistance(double distance) {
        if (distance > 0) {
            this.distance = distance;
        }
        else {
            throw new IllegalArgumentException("Distance must be positive (in kms)");
        }
    }
    public void computeFare() {
        this.fare = this.distance * 16.5;
    }
    @Override
    public String toString() {
        return "Passenger Details:\n" +
                "Name: " + name + "\n" +
                "Mobile: " + mobile + "\n" +
                "Distance: " + distance + " km\n" +
                "Fare: Rs. " + fare;
    }
}