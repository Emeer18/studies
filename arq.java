import java.util.Scanner;

public class arq {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int a,b,c;

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
    //for (tentativas = 2 ; senha != 2332 ; tentativas -- ){
        
        //System.out.println("Digite a senha\n");
        //senha = sc.nextInt();
        //System.out.printf("Senha incorreta, tentativas restantes : %d\n", tentativas);
        
        //if (senha == 2332) {

        //    validaSenha = true;
            
        //}

       // if (tentativas == 0) {

        //    System.out.println("Acesso negado. Senha bloqueada\n");
       //     break;
                
     //   }
    // }

    //if (validaSenha == true) {

     //   System.out.println("Entrada validada.");
        
    //}

   // System.out.println("Encerrado.");

    
    //do{

     //   System.out.println("Digite a quantia de graus que deseja converter : ");
     //   grausCelcius = sc.nextInt();
     //   fahrenheit = 9 * grausCelcius / 5 + 32;
     //   System.out.printf("Fahrenheit : %d\n", fahrenheit);
     //   System.out.println("Deseja uma nova consulta? s/n");
     //   sc.nextLine();
     //  consulta = sc.nextLine();
     //   consulta2 = consulta.charAt(0);

    //} while(consulta2 == 's');

    //System.out.println("Você saiu do aplicativo.");

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int moreHigher = max(a, b, c);

    showResult(moreHigher);

    sc.close();

  

    }

    public static int max(int f, int g, int h){

        int aux = 0;

        if (f > g && f > h) {

            aux = f;
        }

        else if (g > f && g > h) {
                
        aux = g;

        }

        else {

        aux = h;
    
        }
        return aux;
    }

     public static void showResult (int value){

        System.out.printf("Highuer = %d", value);
     }

}
