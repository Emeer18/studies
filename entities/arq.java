import java.util.Scanner;
import entities.Triangle;
import javax.lang.model.util.ElementScanner6;

public class arq {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Double x = new Triangle();
    double xA, xB, xC, yA, yB, yC;
    
    System.out.println("Enter the measures of area X");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();
    System.out.println("Enter the measures of area Y");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    double xP = (xA + xB + xC) / 2.0;
    double XArea = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));

    double yP = (yA + yB + yC) / 2.0;
    double YArea= Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));
    
    if (XArea > YArea) {

        System.out.printf("The Area Height é : %.2f\n" , XArea);
    }
        else { 
        
        System.out.printf("The Area Height ér : %.2f\n" , YArea);
    }

    sc.close();

    }

}
