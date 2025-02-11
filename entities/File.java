package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = null;
        int choice = 0;
        
        System.out.println("Enter your account number and account holder's name.");
        int account = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        
        do {
            System.out.println("Enter 1 to deposit an initial amount or 2 to start without a deposit.");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                System.out.println("Enter the initial deposit amount.");
                double deposit = sc.nextDouble();
                bank = new Bank(name, account, deposit);
                bank.showData();
            } 
            else if (choice == 2) {
                bank = new Bank(name, account);
                bank.showData();
            } 
            else {
                System.out.println("Please enter a valid option!");
            }
        } while (choice != 1 && choice != 2);

        System.out.println("Congratulations, your account has been created!");
        bank.resetChoice(choice);

        do {
            System.out.println("1 - Deposit.\n2 - Withdraw.\n3 - Change name.\n4 - Exit.");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter the amount to be deposited.");
                double deposit = sc.nextDouble();
                bank.deposit(deposit);
                bank.showData();
            } 
            else if (choice == 2) {
                System.out.println("Enter the amount to be withdrawn.");
                double withdrawal = sc.nextDouble();
                bank.withdraw(withdrawal);
                bank.showData();
            } 
            else if (choice != 1 && choice != 2) {
                System.out.println("Please enter a valid option!");
            }
        } while (choice != 4);

        System.out.println("Test completed.");
    }
}
