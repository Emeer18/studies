import java.util.List;
import java.util.Scanner;
import Heritage.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();
    sc.nextLine(); 
    
    for(int i = 0 ; i < n; i++){

    System.out.println("Employee #" + (i+1) + " data: ");
    System.out.println("Outsorce Employee? (y/n)");
    char ch = sc.next().charAt(0);
    sc.nextLine(); 

            if (ch == 'y'){

                System.out.println("Enter the name: ");
                String name = sc.nextLine();
                System.out.println("Enter the hours: ");
                int hours = sc.nextInt();
                System.out.println("Enter the value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.println("Enter the additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine(); 
            
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        
            } else {

                System.out.println("Enter the name: ");
                String name = sc.nextLine();
                System.out.println("Enter the hours: ");
                int hours = sc.nextInt();
                System.out.println("Enter the value per hour: ");
                double valuePerHour = sc.nextDouble();
                sc.nextLine(); 
            
                employees.add(new Employee(name, hours, valuePerHour));
        }
    }

    System.out.println("PAYMENTS: ");
    for (Employee emp : employees) {
        System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }

    sc.close();
    }
}