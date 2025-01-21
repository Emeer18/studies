import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Teste");
    char b1;
    
    b1 = sc.next().charAt(0);
    System.out.printf("A letra escolhida foi: %c", b1);
    sc.close();

    String a;
    int b;
    double c;
    
    sc.next(a);
    sc.nextInt(b);
    sc.nextDouble(c);
        System.out.println();

    
    }
}
