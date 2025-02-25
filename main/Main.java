import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int [][] matrix = new int [n][n];

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                System.out.println("Enter the value for row " + (i + 1) + " and column " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if ((matrix[i][j] < 0)) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);
        sc.close();
    }
}