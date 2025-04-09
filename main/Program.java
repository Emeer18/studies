import java.util.Scanner;

import Heritage.Account;
import Heritage.BusinessAccount;
import Heritage.SavingAccount;

import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

    Scanner sc = new Scanner(System.in);
    
    Account acc = new Account(1001, "Alex", 500.0);
    acc.withdraw(200.0);
    System.out.println("Account: " + acc.getNumber() + ", Holder: " + acc.getHolder() + ", Balance: " + String.format("%.2f", acc.getBalance()));
    System.out.println();
    Account acc2 = new SavingAccount(1002, "Maria", 500.0);
    acc2.withdraw(200.0);
    System.out.println("Account: " + acc2.getNumber() + ", Holder: " + acc2.getHolder() + ", Balance: " + String.format("%.2f", acc2.getBalance()));
    System.out.println();

    Account acc3 = new BusinessAccount(1003, "Bob", 500.0, 400.0);
    acc3.withdraw(200.0);
    System.out.println("Account: " + acc3.getNumber() + ", Holder: " + acc3.getHolder() + ", Balance: " + String.format("%.2f", acc3.getBalance()));
    System.out.println();  



    sc.close();
    }
}