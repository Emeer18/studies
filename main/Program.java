import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Heritage.Product;
import Heritage.UsedProduct;
import Heritage.ImportedProduct;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {

            System.out.println("Common, used or imported (c/u/i)? ");
            char type = sc.nextLine().charAt(0);

            if (type == 'u') {
                System.out.println("Enter product name: ");
                String name = sc.nextLine();
                System.out.println("Enter product price: ");
                double price = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                System.out.println("Enter manufacture date (DD/MM/YYYY): ");
                String dateInput = sc.nextLine();
                LocalDateTime manufactureDate = LocalDateTime.now();

                Product product = new UsedProduct(name, price, frmt.format(manufactureDate));
                products.add(product);
            }

            if (type == 'i') {
                System.out.println("Enter product name: ");
                String name = sc.nextLine();
                System.out.println("Enter product price: ");
                double price = sc.nextDouble();
                System.out.println("Enter customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine(); // Consume the newline character

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }

            if (type == 'c') {
                System.out.println("Enter product name: ");
                String name = sc.nextLine();
                System.out.println("Enter product price: ");
                double price = sc.nextDouble();
                sc.nextLine(); // Consume the newline character

                Product product = new Product(name, price);
                products.add(product);
            }
        }

        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
