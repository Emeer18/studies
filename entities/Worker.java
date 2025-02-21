package entities;

public class Worker {

    private String id;
    private String name;
    private double salary;

    public Worker() {
    }

    public Worker(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    } 

    public void increaseSalary(double percentageIncrease) {
        this.salary += (this.salary * (percentageIncrease / 100));
    }

    @Override
    public String toString() { 
        return "Name: " + name 
             + "\nSalary: " + String.format("%.2f", salary) 
             + "\nID: " + id 
             + "\n---------------------------------------\n";
    }
}
