public class Singleton {
    public String st;
    private static Singleton singleInstance = null;
    private Singleton() {
    }
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
