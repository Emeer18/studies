import entities.Order;
import java.util.Date;
import entities.StatusOrder;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), StatusOrder.PENDING_PAYMENT);

        System.out.println(order);

        StatusOrder os1 = StatusOrder.DELIVERED;

        StatusOrder os2 = StatusOrder.valueOf("DELIVERED"); // converte uma string para um enum

        System.out.println(os1);
        System.out.println(os2);    

    }
}