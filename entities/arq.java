package entities;
import java.util.Scanner;

public class arq{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Bank bank = null;
        int escolha = 0;

        System.out.println("Digite sua conta, o nome do titular." );
        int account = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        

        do{

        System.out.println("Digite 1 para depositar um valor inicial e 2 para iniciar sem um depósito." );
        escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == 1 ) {

            System.out.println("Insira o valor a ser depositado.");
            double deposit = sc.nextDouble();
            bank = new Bank(name, account, deposit);
            bank.showData();
            
        }

        if (escolha == 2) {

            bank = new Bank (name, account);
            bank.showData();
            
        }
    } while(escolha != 1 && escolha != 2);


    }
}