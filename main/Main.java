import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

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
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            HourContract hourContract = new HourContract();
            DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String dateString = sc.nextLine();
            hourContract.setDate(null);
            
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            Worker worker = new Worker(name, lv, baseSalary);

        }
        
        Worker worker = new Worker(name, lv, baseSalary);
        System.out.println(worker.getName());
        System.out.println(worker.getLevel());
        System.out.println(worker.getBaseSalary());



        sc.close();
    }
}