import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    char a,b,c,d,e,f;
    String escolha = "";

    System.out.println("Digite o dia da semana sendo a para segunda ....");  
    escolha = sc.next();

    switch (escolha) {
        case "a":
            
        System.out.println("Segunda-Feira");
           
        break;
    
        case "b":
            
        System.out.println("Terça-Feira");
           
        break;
        case "c":
            
        System.out.println("Quarta-Feira");
           
        break;
        case "d":
            
        System.out.println("Quinta-Feira");
           
        break;
        default: 
            System.out.println("Valor inválido");
            break;
    
    }

    sc.close();
    
    }
}
