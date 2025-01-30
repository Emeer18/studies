package entities;
import java.util.Scanner;

public class arq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle;

        rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.toString());

        sc.close();
    }
}