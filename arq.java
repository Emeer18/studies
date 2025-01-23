import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int senha = 0;
    int tentativas = 0;
    boolean validaSenha = false;
    //System.out.println("Digite o dia da semana sendo a para segunda ....");  
    //escolha = sc.nextInt();

    //int ternario = (escolha > 12) ? 50000 : 2000;

    //System.out.printf("%d", ternario);
    
    
    //System.out.println("Digite um número : ");
    //escolha = sc.nextInt();
    //System.out.println("Digite a idade : ");
    //int idade = sc.nextInt();

    //String parImpar = (escolha %2 == 0) ? "par" : "impar";

    //System.out.printf("O número é %s\n", parImpar);

    //String maiorIdade = (idade >= 18) ? "maior de idade" : "menor de idade";

    //System.out.printf("Esta pessoa é %s", maiorIdade);
    
    //while (escolha > 12) {

     //   System.out.println("Teste");
       // escolha = sc.nextInt();
        
    //}
    for (tentativas = 2 ; senha != 2332 ; tentativas -- ){
        
        System.out.println("Digite a senha\n");
        senha = sc.nextInt();
        System.out.printf("Senha incorreta, tentativas restantes : %d\n", tentativas);
        
        if (senha == 2332) {

            validaSenha = true;
            
        }

        if (tentativas == 0) {

            System.out.println("Acesso negado. Senha bloqueada\n");
            break;
                
        }
    }

    if (validaSenha == true) {

        System.out.println("Entrada validada.");
        
    }

    System.out.println("Encerrado.");

    
    sc.close();

  

    }

}
