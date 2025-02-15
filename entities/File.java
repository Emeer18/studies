package entities;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int count = 0;
        double percentual = 0.0;
        double avg = 0.0;
        double sum = 0.0;
        
        People[] vect = new People[number];
        String[] vectName = new String[count];
      

        for(int i = 0; i < vect.length ; i++){

            System.out.println("Enter the person's name, age, and height.");
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);
            sum += vect[i].height;
            
        }
            

        for(int i = 0; i < vect.length ; i++){

            if (vect[i].age < 16) {
                
                count ++;
                
            }
            
        }
        

        System.out.printf("Average heigt: %.2f\n", avg = sum / number);
        System.out.printf("Percentage of people under 16 years old: %.2f%%\n", percentual = (count * 100) / number);

        for(int i = 0; i < vect.length ; i++){
            if(vect[i].age < 16 ){
                System.out.println(vect[i].name);
            }
        }

        sc.close();
    }
}
