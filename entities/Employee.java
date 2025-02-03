package entities;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;
    public double netSalary;

    public Double calculateNetSalary() {
        netSalary = grossSalary - tax;
        return netSalary;
    }

    public String toString(double salary){
        return ("Name: " + name + "\nSalary: R$" + salary);
    }
}