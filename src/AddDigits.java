public class AddDigits {
    public static int addDigits (int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 54;
        int output = addDigits(n);
        System.out.println("Output: " + output);
    }
}