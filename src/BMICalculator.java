import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Virat's weight (in kg): ");
        double viratWeight = sc.nextDouble();
        System.out.println("Enter Virat's height (in m): ");
        double viratHeight = sc.nextDouble();
        double viratBMI = calculateBMI(viratWeight, viratHeight);
        System.out.println("Virat's BMI is: " + viratBMI);
        System.out.println("Virat's status of health: " + getBMICategory(viratBMI));
        System.out.println();
        System.out.println("Enter Anushka's Weight (in kg): ");
        double anushkaWeight = sc.nextDouble();
        System.out.println("Enter Anushka's height (in m): ");
        double anushkaHeight = sc.nextDouble();
        double anushkaBMI = calculateBMI(anushkaWeight, anushkaHeight);
        System.out.println("Anushka's BMI is: " + anushkaBMI);
        System.out.println("Anushka's status of health: " + getBMICategory(anushkaBMI));
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        }
        else {
            return "Obesity";
        }
    }
}