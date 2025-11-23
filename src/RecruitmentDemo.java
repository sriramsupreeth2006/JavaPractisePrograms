import java.util.*;
class EligibilityException extends Exception {
    public EligibilityException(String msg) {
        super(msg);
    }
}
class Recruitment {
    public static void checkEligibility(double btechMarks, double writtenMarks) throws EligibilityException {
        if (btechMarks < 60)
            throw new EligibilityException("B.Tech marks below 60%");
        if (writtenMarks < 70)
            throw new EligibilityException("Written test marks below 70%");
        System.out.println("Eligible for recruitment!");
    }
}
public class RecruitmentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter B.Tech percentage: ");
        double btech = sc.nextDouble();
        System.out.print("Enter Written test percentage: ");
        double written = sc.nextDouble();
        try {
            Recruitment.checkEligibility(btech, written);
        } catch (EligibilityException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
