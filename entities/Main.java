package entities;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Aluno aluno;
        aluno = new Aluno();

        System.out.println("Digite as 3 notas do aluno : ");
        aluno.grade1 = sc.nextDouble();
        aluno.grade2 = sc.nextDouble();
        aluno.grade3 = sc.nextDouble();
        
        aluno.calculaMedia();
    }
}