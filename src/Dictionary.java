package dict;
public class Dictionary {
    private String name;
    private String mobile;
    public Dictionary(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public String getMobile() {
        return mobile;
    }
    public String toString() {
        return "Name: " + name + ", Mobile: " + mobile;
    }
}