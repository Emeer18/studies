import java.util.Scanner;

import Heritage.Account;
import Heritage.BusinessAccount;
import Heritage.SavingAccount;

import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

    Scanner sc = new Scanner(System.in);
    
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
    Account sacc = new SavingAccount(1003, "Bob", 0.0, 0.01);

    Account acc1 = bacc; // Upcasting
    BusinessAccount bacc1 = (BusinessAccount)sacc; 

    if(sacc instanceof BusinessAccount) {
        BusinessAccount bacc2 = (BusinessAccount) sacct; // Downcasting
        bacc2.loan(200.0);
        System.out.println("Loan1!");
    }
    if(sacc  instanceof SavingAccount) {
        BusinessAccount bacc2 = (BusinessAccount) sacc; // Downcasting
        bacc2.loan(200.0);
        System.out.println("Loan2!");
    } else {
        System.out.println("Not a business account");
    }
    

    sc.close();
    }
}