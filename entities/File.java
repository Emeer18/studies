package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        double sum = 0;

        Product[] vect = new Product[n];
        System.out.println("Digite os produtos e seus valores.");


        for(int i = 0; i < vect.length; i++){

            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
 
        }
        
        for(int i = 0; i < vect.length; i++){

            sum += vect[i].getPrice();            

        }

        double avg = sum / n;
        System.out.printf("AVERAGE = %.2f", avg);

        sc.close();
    }
}
