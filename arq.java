import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    double delta, x1, x2 = 0;
    
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    delta = Math.pow(b,2) - 4 * a * c;
        
    System.out.println("delta = " + delta);

    x1 = (-b + Math.sqrt(delta)) / (2 * a);

    System.out.println("x1 = " + x1);
    
    }
}
