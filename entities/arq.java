package entities;
import java.util.Scanner;

public class arq {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Triangle x, y;
    x = new Triangle();    
    y = new Triangle();

    System.out.println("Enter the measures of area X");

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measures of area Y");
    
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double XArea = x.area();
    double YArea= y.area();
    
    Triangle.imprimeArea(XArea, YArea);

    sc.close();

    }

}
