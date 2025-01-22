import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int cobranca = 50;
    int quantidadeMinutos;    

    System.out.println("Digite a quantidade de minutos.");
    quantidadeMinutos = sc.nextInt();

    if (quantidadeMinutos > 100) {

        cobranca += (quantidadeMinutos - 100) * 2;
        System.out.printf("Valor a pagar : %d", cobranca);
    }
    
    if (quantidadeMinutos <= 100) {
        
        System.out.printf("Valor a pagar : %d", cobranca);

    }
      
    



    sc.close();
    
    }
}
