abstract class OfcEmployee {
    String name;
    OfcEmployee(String name) { this.name = name; }
    abstract double earnings();
}
class SalariedEmployee extends OfcEmployee {
    double weeklySalary;
    SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }
    double earnings() {
        return weeklySalary;
    }
}
class HourlyEmployee extends OfcEmployee {
    double hourlyRate;
    double hours;
    HourlyEmployee(String name, double hourlyRate, double hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double earnings() {
        if (hours <= 40)
            return hours * hourlyRate;
        else
            return (40 * hourlyRate) + (hours - 40) * hourlyRate * 1.5;
    }
}
class CommissionEmployee extends OfcEmployee {
    double sales;
    double rate;
    CommissionEmployee(String name, double sales, double rate) {
        super(name);
        this.sales = sales;
        this.rate = rate;
    }
    double earnings() {
        return sales * rate;
    }
}
class BaseSalariedCommissionEmployee extends CommissionEmployee {
    double baseSalary;
    BaseSalariedCommissionEmployee(String name, double sales, double rate, double baseSalary) {
        super(name, sales, rate);
        this.baseSalary = baseSalary + baseSalary * 0.10; // add 10%
    }
    double earnings() {
        return baseSalary + super.earnings();
    }
}
public class PayrollDemo {
    public static void main(String[] args) {
        OfcEmployee[] employees = {
                new SalariedEmployee("Sriram", 8000),
                new HourlyEmployee("Meghamsh", 200, 45),
                new CommissionEmployee("Siva", 50000, 0.08),
                new BaseSalariedCommissionEmployee("Vamshi", 60000, 0.10, 5000)
        };
        for (OfcEmployee e : employees) {
            System.out.println(e.name + " earns: ₹" + e.earnings());
        }
    }
}
