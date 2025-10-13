public class Utility {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int output1 = add(57, 14);
        int output2 = add(41, 38, 29);
        int output3 = add(new int[] {19, 29, 39, 49, 59});
        System.out.println("Sum of two numbers is     : " + output1);
        System.out.println("Sum of three numbers is   : " + output2);
        System.out.println("Sum of array elements is  : " + output3);
    }
}