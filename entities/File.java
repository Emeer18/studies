package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double sum = 0;

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            
            System.out.println("Digita aí");
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            sum += vect [i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE = %.2f", avg);

        sc.close();
    }
}
