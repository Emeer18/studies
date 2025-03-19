import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;
import entities.Department; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();   
        System.out.print("Level: ");
        String level = sc.nextLine();
        WorkerLevel lv = WorkerLevel.valueOf(level);
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker workers = new Worker(name, lv, baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            HourContract hourContract = new HourContract();

            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String dateString = sc.nextLine();
            hourContract.setDate(dateString);
            
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(hourContract.getDate(), valuePerHour, hours);  
            workers.addContract(contract);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + workers.getName());
        System.out.println("Department: " + workers.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", workers.income(year, month)));
        


        sc.close();
    }
}