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

    x.p = (x.a + x.b + x.c) / 2.0;
    double XArea = Math.sqrt(x.p * (x.p - x.a) * (x.p - x.b) * (x.p - x.c));

    y.p = (y.a + y.b + y.c) / 2.0;
    double YArea= Math.sqrt(y.p * (y.p - y.a) * (y.p - y.b) * (y.p - y.c));
    
    Triangle.imprimeArea(XArea, YArea);

    sc.close();

    }

}
