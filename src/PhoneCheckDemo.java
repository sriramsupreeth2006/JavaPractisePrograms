import java.util.*;
class InvalidPhoneException extends Exception {
    public InvalidPhoneException(String msg) {
        super(msg);
    }
}
class StudentPhoneValidator {
    public static void validatePhone(String phone) throws InvalidPhoneException {
        if (phone.length() != 10)
            throw new InvalidPhoneException("Phone number must be exactly 10 digits");
        if (!phone.matches("\\d{10}"))
            throw new InvalidPhoneException("Phone number contains alphabets or symbols");
        System.out.println("Valid phone number!");
    }
}
public class PhoneCheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = sc.next();
        try {
            StudentPhoneValidator.validatePhone(phone);
        } catch (InvalidPhoneException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
