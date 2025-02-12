package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        double[] vect = new double [number];
        double sum = 0;
        double average = 0.0;

        for(int i = 0; i < vect.length ; i++){
            System.out.println("Type a number.");
            vect[i] = sc.nextInt();
            sum += vect[i];
        }

        System.out.println("Values : ");

        for(int i = 0; i < vect.length ; i++){

            System.out.println(vect[i]);

            
        }

        System.out.printf("Sum = %.2f\n", sum);
        System.out.printf("Average : %.2f", average = sum / number);
        
        sc.close();
    }
}
