package entities;
import entities.Employee;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Employee employee;
        employee = new Employee();

        System.out.println("Enter the employee name, their gross salary and tax.");
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        sc.nextLine();
        employee.tax = sc.nextDouble();
        employee.calculateNetSalary();
        System.out.println(employee.toString(employee.netSalary));

        System.out.println("Enter the percentage to be added to the gross salary.");
        int percentage = sc.nextInt();

        employee.netSalary = (employee.netSalary + (employee.grossSalary * (percentage / 100.0)));
        System.out.println(employee.toString(employee.netSalary));

        sc.close();
    }
}