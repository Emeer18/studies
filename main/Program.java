import java.util.Scanner;
import java.text.SimpleDateFormat;

import entities.Order;
import entities.Enums.OrderStatus;
import entities.Client;
import entities.Product; 
import entities.OrderItem;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    String birthDate = sc.nextLine();
    Client client = new Client(name, email, birthDate);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.nextLine());
    Order order = new Order(sdf.parse("21/06/2018 13:05:44"), status);
    order.setClient(client);

    System.out.print("How many items to this order? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        double productPrice = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
    }

    System.out.println();
    StringBuilder sb = new StringBuilder();
    sb.append("ORDER SUMMARY:\n");
    sb.append("Order moment: ").append(sdf.format(order.getMoment())).append("\n");
    sb.append("Order status: ").append(order.getStatus()).append("\n");
    sb.append("Client: ").append(client).append("\n");
    sb.append("Order items:\n");
    System.out.println(sb.toString());

    for (OrderItem item : order.getItems()) {
        System.out.println(item);
    }
    
    System.out.println("Total price: $" + String.format("%.2f", order.total()));
    sc.close();
    }
}