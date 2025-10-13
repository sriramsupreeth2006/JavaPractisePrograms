public class MyInteger {
    static int value;
    static {
        value = 31;
        System.out.println("Static block initialized value: " + value);
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("\nChecking the value: " + value);
        System.out.println("Is it Even?: " + isEven(value));
        System.out.println("Is it Odd?: " + isOdd(value));
        System.out.println("Is it Prime?: " + isPrime(value));
    }
}