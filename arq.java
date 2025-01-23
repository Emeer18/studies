import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int escolha;

    //System.out.println("Digite o dia da semana sendo a para segunda ....");  
    //escolha = sc.nextInt();

    //int ternario = (escolha > 12) ? 50000 : 2000;

    //System.out.printf("%d", ternario);
    
    //sc.close();
    System.out.println("Digite um número : ");
    escolha = sc.nextInt();
    System.out.println("Digite a idade : ");
    int idade = sc.nextInt();

    String parImpar = (escolha %2 == 0) ? "par" : "impar";

    System.out.printf("O número é %s\n", parImpar);

    String maiorIdade = (idade >= 18) ? "maior de idade" : "menor de idade";

    System.out.printf("Esta pessoa é %s", maiorIdade);

    }

}
