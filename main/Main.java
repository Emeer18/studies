import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Worker;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Worker> workerList = new ArrayList<>();

        System.out.println("Enter the number of employees to be registered:");
        int numberOfEmployees = sc.nextInt();
        
        for (int count = 0; count < numberOfEmployees; count++) {
            sc.nextLine(); // Consume the newline left from nextInt()

            System.out.println("Enter employee name:");
            String name = sc.nextLine();

            System.out.println("Enter employee ID:");
            String id = sc.nextLine();

            System.out.println("Enter employee salary:");
            double salary = sc.nextDouble();

            workerList.add(new Worker(id, name, salary));
        }

        // Display the list of registered employees
        for (Worker worker : workerList) {
            System.out.println(worker); 
        }

        System.out.println("Enter the ID of the employee to receive a salary increase:");
        sc.nextLine();
        String receivedId = sc.nextLine();

        System.out.println("Enter the percentage increase to be applied to the salary:");
        double percentageIncrease = sc.nextDouble();

        int position = -1;
        for (int count = 0; count < workerList.size(); count++) {
            if (workerList.get(count).getId().equals(receivedId)) {
                position = count;
                break;
            }
        }

        if (position != -1) {
            Worker worker = workerList.get(position);
            
            // Apply the salary increase
            worker.increaseSalary(percentageIncrease);

            System.out.println("Salary successfully updated!");
        } else {
            System.out.println("Employee not found.");
        }

        // Display the updated list of employees
        for (Worker worker : workerList) {
            System.out.println(worker); 
        }

        sc.close();
    }
}
