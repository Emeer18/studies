package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] vect = new int [n];
   

        for(int i = 0; i < vect.length ; i++){
            System.out.println("Digite um número.");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers : ");

        for(int i = 0; i < vect.length ; i++){

            if (vect[i] < 0) {
           
            System.out.println(vect[i]);
            
            }
            
        }
        sc.close();
    }
}
