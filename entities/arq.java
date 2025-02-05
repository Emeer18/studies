package entities;
import java.util.Scanner;

public class arq{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product product;
        
        char choice = '0';

        System.out.println("Enter Product, Price, and quantity in stock.");
    
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        sc.nextLine();
        product = new Product(name, price, quantity);
        product.totalValueInStock();

        System.out.printf(product.toString());
do{
            System.out.println("\nEnter 1 to add product, 2 to remove product, or 3 to exit.");
            String choiceTotal = sc.nextLine();
            choice =  choiceTotal.charAt(0);


            if (choice == '1') {
                System.out.println();
                System.out.println("Enter the quantity to be added.");
                quantity = sc.nextInt();
                sc.nextLine();
                product.addProduct(quantity);

            } else if (choice == '2') {
                System.out.println();
                System.out.println("Enter the quantity to be removed.");
                quantity = sc.nextInt();
                sc.nextLine();
                product.removeProducts(quantity);
            }

        }
        while (choice != '3');

        System.out.printf(product.toString());
        sc.close();
        }

    }
