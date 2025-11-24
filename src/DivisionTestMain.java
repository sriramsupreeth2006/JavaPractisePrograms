import java.util.*;
class MyException extends Exception {
    int param;
    MyException(int param) {
        this.param = param;
    }
    public String toString() {
        return "MyException[" + param + "]";
    }
}
public class DivisionTestMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers for division:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result = " + (a / b));
            sc.nextLine();
            System.out.println("Enter a numeric string:");
            String numStr = sc.nextLine();
            int n = Integer.parseInt(numStr);
            System.out.println("Parsed number = " + n);
            System.out.println("Enter a string:");
            String s = sc.nextLine();
            System.out.println("Enter string index to access:");
            int index = sc.nextInt();
            System.out.println("Character = " + s.charAt(index));
            System.out.println("Enter array size:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter index to access in array:");
            int arrIndex = sc.nextInt();
            System.out.println("Value = " + arr[arrIndex]);
            System.out.println("Enter a number to test MyException:");
            int x = sc.nextInt();
            if (x < 0) throw new MyException(x);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid division");
        }
        catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (MyException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Exception encountered");
        }
        finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
