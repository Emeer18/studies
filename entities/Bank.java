package entities;

public class Bank {
    
    private String name;
    private int accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Bank(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public double initialDeposit(double deposit) {
        balance += balance + deposit;
        return balance;
    }

    public void deposit(double deposit) {
        setBalance(this.balance + deposit);
    }

    public void withdraw(double withdrawal) {
        setBalance(this.balance - withdrawal - 5.0);
    }

    public void resetChoice(int choice) {
        choice = 0;
    }

    public void showData() {
        System.out.println("Name: " + name 
            + "\nAccount: " + accountNumber 
            + "\nBalance: " + balance);
    }
}
