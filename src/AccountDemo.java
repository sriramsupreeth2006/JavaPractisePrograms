import java.util.ArrayList;
import java.util.Scanner;
class AccountTransfer {
    private int id = 0;
    private double balance = 0;
    AccountTransfer() {}
    AccountTransfer(int id, double balance) {
        setId(id);
        setBalance(balance);
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public boolean setId(int id) {
        if (id >= 0) {
            this.id = id;
            return true;
        }
        return false;
    }
    public boolean setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            return true;
        }
        return false;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void printDetails() {
        System.out.println("Account ID: " + id + ", Balance: " + balance);
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        ArrayList<AccountTransfer> accounts = new ArrayList<>();
        accounts.add(new AccountTransfer(101, 5000));
        accounts.add(new AccountTransfer(102, 2000));
        accounts.add(new AccountTransfer(103, 8000));
        System.out.println("----- Account Details -----");
        for (AccountTransfer acc : accounts) {
            acc.printDetails();
        }
        System.out.println("\nPerforming operations on account 101:");
        AccountTransfer acc = accounts.get(0);
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.printDetails();
    }
}
